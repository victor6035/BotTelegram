import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId

class echo {

    fun eco(){
        val bot = bot {

            token =  "1776107814:AAF4_qjRVgQz0sdKa20hPy-ZX-KTlVy3Hwg"

            dispatch {

                text {

                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = text)
                }
            }
        }

        bot.startPolling()
    }
}