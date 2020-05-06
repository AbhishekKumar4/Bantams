
			(Current Time)	- (Old Timestamp)
var diff = new Date().valueOf() - 1588741489259;
var diffMinutes = Math.round(((diff % 86400000) % 3600000) / 60000);

console.log('diffMinutes : ' + diffMinutes)