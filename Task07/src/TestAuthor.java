public class TestAuthor {
    public static void main(String[] args) {
        Author tea = new Author("December", "december@gmail.com", 'm');
        System.out.println(tea);

        tea.setEmail("december@newemail.com");
        System.out.println("New:\n"+tea);
    }
}
