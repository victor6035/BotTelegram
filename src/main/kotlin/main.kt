import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ParseMode
import com.github.kotlintelegrambot.network.fold

fun main() {

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