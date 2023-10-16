function reverseWordsInSentence(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); 
