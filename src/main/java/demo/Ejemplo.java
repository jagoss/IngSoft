package demo;

public class Ejemplo {

        public static void main(String[] args) {
            SlackMessage slackMessage = SlackMessage.builder()
                    .channel("#prueba")
                    .username("UQ5U4709L")
                    .text("Hello World!")
                    .icon_emoji(":twice:")
                    .build();
            SlackUtils.sendMessage(slackMessage);
        }

}
