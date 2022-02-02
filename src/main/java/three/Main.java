package three;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("[aeiouy].*[aeiouy]");

        List<String> wordList = getWordList();

        wordList.stream()
                .filter(s -> p.matcher(s).find())
                .forEach(System.out::println);

    }

    public static List<String> getWordList() {
        return List.of(
                "yielding",
                "enthusiastic",
                "sponge",
                "add",
                "sky",
                "tricky",
                "board",
                "fretful",
                "kaput",
                "toes",
                "flagrant",
                "arrange",
                "occur",
                "transport",
                "offbeat",
                "undress",
                "shoes",
                "concerned",
                "muddled",
                "blow",
                "fire",
                "permit",
                "consider",
                "internal",
                "reward",
                "coordinated",
                "awesome",
                "ritzy",
                "language",
                "wistful",
                "paddle",
                "caption",
                "notebook",
                "force",
                "light",
                "door",
                "low",
                "tangible",
                "unwieldy",
                "ugliest",
                "screeching",
                "dangerous",
                "certain",
                "efficacious",
                "verse",
                "flash",
                "dirty",
                "far",
                "throne",
                "run"
        );
    }

}
