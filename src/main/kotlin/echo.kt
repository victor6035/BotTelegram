import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId

class echo {

    fun eco(){
        val bot = bot {

            token =  Constantes.miToken

            dispatch {

                command("eco") {

                    text {

                        bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = text)
                    }
                }
            }
        }

        bot.startPolling()
    }
}