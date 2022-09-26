class UtilClass {
    totalCount(numArr) {
        let sum = 0;
        // Given an array of numbers,  return the sum of the array
        for (let i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        return sum
    }

    printMessages(msgArr) {
        // Given an array of String, write a function to print messages 
        for (const eachMessage of msgArr) {
            console.log(eachMessage)
        }
        // for (let i = 0; i < msgArr.length; i++) {
        //     console.log(msgArr[i])
        // }
    }
}


console.log("Hello World")

var messagesPerDay = [5, 8, 6]
var messages = ["Please call back!", "Make sure you install jdk", "Help debug please!"]

var newBot = new UtilClass()

console.log(newBot.totalCount(messagesPerDay));
newBot.printMessages(messages);


