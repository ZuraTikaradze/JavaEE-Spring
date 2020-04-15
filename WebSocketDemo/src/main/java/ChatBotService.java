public class ChatBotService {
    public static String answer(String question) {
        String result;

        switch (question) {
            case "გამარჯობა":
                result = "გამარჯობა, რითი შემიძლია დაგეხმაროთ?";
                break;
            case "რომელი საათია?":
                result = "10";
                break;
            default:
                result = "ამ კითხვაზე პასუხი არ მაქვს";
        }

        return result;
    }
}
