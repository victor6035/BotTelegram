import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.pollAnswer
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.polls.PollType.QUIZ


class Encuesta {

    fun encuesta() {


        bot {
            token = Constantes.miToken
            dispatch {
                pollAnswer {
                    println("${pollAnswer.user.username} has selected the option ${pollAnswer.optionIds.lastOrNull()} in the poll ${pollAnswer.pollId}")
                }

                command("prefieres") {
                    bot.sendPoll(
                        chatId = ChatId.fromId(message.chat.id),
                        type = QUIZ,
                        question = "Acciones o Criptos",
                        options = listOf("Acciones", "Criptos"),
                        correctOptionId = 1,
                        isAnonymous = false

                    )
                }

                command("accion") {
                    bot.sendPoll(
                        chatId = ChatId.fromId(message.chat.id),
                        type = QUIZ,
                        question = "Que accion comprarias",
                        options = listOf("Tesla", " Alphabet"),
                        correctOptionId = 1,
                        isAnonymous = false
                    )
                }

                command("apalancamiento") {
                    bot.sendPoll(
                        chatId = ChatId.fromId(message.chat.id),
                        type = QUIZ,
                        question = "Apalancamiento?",
                        options = listOf("Si", "No" ,"No se que es"),
                        correctOptionId = 1,
                        isAnonymous = false
                    )
                }
                command("criptomoneda") {
                    bot.sendPoll(
                        chatId = ChatId.fromId(message.chat.id),
                        type = QUIZ,
                        question = "BitCoin o Ethereum?",
                        options = listOf("BitCoin"  ,"Ethereum"),
                        correctOptionId = 1,
                        isAnonymous = false
                    )
                }


            }


        }.startPolling()

    }
}
