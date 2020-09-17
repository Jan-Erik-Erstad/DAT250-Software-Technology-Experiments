## Installation: MongoDB Database

#### Integrity and authenticity

Downloading and checking the integrity and authenticity of the intallation package using PGP. 

Note that we could have just installed MongoDB from Brew. This would not have preformed a PGP signature check, but would use the checksum to validate file integrity. 

- As seen below, the installation package, signature and key file was downloaded
- When trying to import the key file I got the error message "-bash: gpg: command not found". This was due to the GNU Privacy Guard not beeing intalled on my system. This was not a problem as we can simply install GPG from Brew.  

![expass3_1.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_1.png?raw=true)

- The key import worked fine after GNU Privacy Guard was installed.

![expass3_2.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_2.png?raw=true)

- We where now able to use GNU Privacy Guard to verify authenticity and integrity of our installation package.

![expass3_3.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_3.png?raw=true)

- We see that we get a warning, but as the primary key fingerprint matches the one on the guide i'm inclined to ignore this warning.  We can of course also validate file integrity using the checksum as below.

![expass3_4.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_4.png?raw=true)



#### Installation

- To install i unpacked the intallation package and copied the files to /usr/local/bin

![expass3_5.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_5.png?raw=true)

![expass3_6.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_6.png?raw=true)

- I made the mongodb and log/mongodb directories.
- I got an an error while running mongo, it was easy corrected by giving my user "jee" access to the directories

![expass3_7.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_7.png?raw=true)

- The MongoDB is now running fine.

![expass3_9.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_9.png?raw=true)



## Experiment 1: MongoDB CRUD operations

Note that i am clearing the inventory between categories using the db.inventory.deleteMany({}) command. You can assume that i am populating new data using the data from the guide, this will not be screenshoted other than in "Insert Documents" where this is relevant. I will be following all the pages in the tutorials, but there will be only one screenshot per category.

#### Insert Documents

![expass3_10.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_10.png?raw=true)

#### Query Documents

![expass3_11.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_11.png?raw=true)

#### Update Documents

![expass3_12.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_12.png?raw=true)

#### Delete Documents

![expass3_13.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_13.png?raw=true)

#### Bulk Write Operations

![expass3_14.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_14.png?raw=true)



## Experiment 2: Aggregation

#### Map-Reduce Examples

![expass3_15.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_15.png?raw=true)

#### Additional Map-reduce operation

I am using the same dataset as above in my map-reduce operation. 

The information i want to retain and calculate is:

- date, i am using this as the key
- total price per date 
- colli receved per date
- total orders per date

The map function will retain the order date, price, colli's and a orders counter. The order counter is set as one and will be used to count how many orders there is on a given date. The colli's is the total quantity on the order, this will be used to find the total quantity per date.

```javascript
var myMapFunction = function() {
    var colli = 0;
    for (var j = 0; j < this.items.length; j++) {
      colli += this.items[j].qty;
    }
    var value = { orders: 1, price: this.price, colli: colli }
    emit(this.ord_date, value)
}
```

Here we can see that we are adding the number of orders, total price and total colli's for every date 

```javascript
var myReduceFunctionCost = function(keyDate, countPriceColli) {
  reducedValues = { orders: 0, price: 0, colli: 0 };
  
  for (var i = 0; i < countPriceColli.length; i++) {
    reducedValues.orders += countPriceColli[i].orders;
    reducedValues.price += countPriceColli[i].price;
    reducedValues.colli += countPriceColli[i].colli;
  }
  
  return reducedValues;
}
```

This is then made avalable in the map "my_map_reduce_example"

```sql
db.orders.mapReduce(
	myMapFunction,
  myReduceFunctionCost,
  { out: "my_map_reduce_example" }
)
```

Lets try to run this:

![expass3_16.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_16.png?raw=true)

![expass3_17.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_17.png?raw=true)

![expass3_18.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_18.png?raw=true)

![expass3_19.png](https://github.com/Jan-Erik-Erstad/DAT250-Software-Technology-Experiments/blob/master/Screenshots/expass3_19.png?raw=true)

As you can see, we now have easy access to the number of orders, total price and total colli's on a given date.
