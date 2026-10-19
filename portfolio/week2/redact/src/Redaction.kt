// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(originalText: String, redactedText: String, Sub_text: Char = 'X'): String {

    val words = originalText.split(" ").toMutableList()
    for (word in words){
        if (word == redactedText){
            var redact = ""
            words[words.indexOf(word)] = buildString{
                for (n in 1..(word.length)){
                    redact += Sub_text
                }
            }
        }
    }

    var stringOut = ""
    for(word in words){

        stringOut = buildString{
            for(n in 0..(words.size)){
                stringOut += word[n]
            }
        }
    }
    
    return originalText
}
