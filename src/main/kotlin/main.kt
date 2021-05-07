import Apikey.miToken
import com.github.kotlintelegrambot.bot


fun main() {
    val bot = bot {
        token = Apikey.miToken
    }
    dispatch {

        text {
            print("Chat ID: ")
            println(message.chat.id)
            bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = text)


        }
    }
}