package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: li4  reason: default package */
/* loaded from: classes.dex */
public abstract class li4 {
    public static final LinkedHashMap a = new LinkedHashMap();
    public static final LinkedHashMap b;
    public static ji4 c;
    public static boolean d;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b = new LinkedHashMap();
        d = true;
        List c0 = hf.c0("Бэтмен", "Бэтмэн", "Брюс", "Bruce", "Wayne", "Dark Knight");
        ki4 ki4Var = ki4.MALE;
        b("Batman", c0, ki4Var, "Hero", "HERO_DARK_VIGILANTE");
        b("Snake", hf.c0("Снейк", "Солид Снейк", "Solid Snake", "Big Boss"), ki4Var, "Hero", "HERO_DARK_VIGILANTE");
        b("Kratos", hf.b0("Кратос"), ki4Var, "Hero", "HERO_DARK_VIGILANTE");
        b("Wesker", hf.b0("Вескер"), ki4Var, "Villain", "HERO_DARK_VIGILANTE");
        b("Joker", hf.c0("Джокер", "Клоун", "Clown Prince", "Joker:"), ki4Var, "Villain", "VILLAIN_MANIC");
        b("Fawful", hf.b0("Фофул"), ki4Var, "Villain", "VILLAIN_MANIC");
        b("Kefka", hf.b0("Кефка"), ki4Var, "Villain", "VILLAIN_MANIC");
        b("Dimentio", hf.b0("Диментио"), ki4Var, "Villain", "VILLAIN_MANIC");
        b("Bowser", hf.c0("Боузер", "Баузер", "Купа", "King Bowser"), ki4Var, "Boss", "VILLAIN_BOSS");
        b("Ganondorf", hf.c0("Ганондорф", "Ганон", "Ganon"), ki4Var, "Boss", "VILLAIN_BOSS");
        b("Giovanni", hf.b0("Джованни"), ki4Var, "Boss", "VILLAIN_BOSS");
        b("Dedede", hf.c0("Дидиди", "Дедеде", "King Dedede"), ki4Var, "Boss", "VILLAIN_BOSS");
        b("Eggman", hf.c0("Эггман", "Роботник", "Dr. Eggman"), ki4Var, "Boss", "VILLAIN_BOSS");
        b("Death", hf.c0("Смерть", "Grim Reaper"), ki4Var, "Demon", "DEEP_DEMON");
        b("Dracula", hf.b0("Дракула"), ki4Var, "Demon", "DEEP_DEMON");
        List b0 = hf.b0("Гиратина");
        ki4 ki4Var2 = ki4.NEUTRAL;
        b("Giratina", b0, ki4Var2, "Demon", "DEEP_DEMON");
        b("Darkrai", hf.b0("Даркрай"), ki4Var2, "Demon", "DEEP_DEMON");
        b("Mewtwo", hf.b0("Мьюту"), ki4Var2, "Demon", "DEEP_DEMON");
        b("Oak", hf.c0("Оук", "Профессор Оук", "Professor Oak"), ki4Var, "Elder", "WISE_ELDER");
        b("Rowan", hf.c0("Роуэн", "Профессор Роуэн"), ki4Var, "Elder", "WISE_ELDER");
        b("Deckard", hf.b0("Декард"), ki4Var, "Elder", "WISE_ELDER");
        b("Judge", hf.c0("Судья", "Ваша Честь", "Your Honor"), ki4Var, "Judge", "WISE_ELDER");
        b("Luke", hf.c0("Люк", "Luke Triton"), ki4Var, "Apprentice", "YOUNG_BOY");
        b("Tails", hf.c0("Тейлз", "Тейлс", "Miles Tails Prower"), ki4Var, "Companion", "YOUNG_BOY");
        b("Ness", hf.b0("Несс"), ki4Var, "Hero", "YOUNG_BOY");
        b("Lucas", hf.b0("Лукас"), ki4Var, "Hero", "YOUNG_BOY");
        List c02 = hf.c0("Перл", "Перл Фей");
        ki4 ki4Var3 = ki4.FEMALE;
        b("Pearl", c02, ki4Var3, "Companion", "YOUNG_GIRL");
        b("Ema", hf.c0("Эмма", "Эма Скай"), ki4Var3, "Detective", "YOUNG_GIRL");
        b("Flora", hf.c0("Флора", "Flora Reinhold"), ki4Var3, "Heroine", "YOUNG_GIRL");
        b("Nanami", hf.b0("Нанами"), ki4Var3, "Companion", "YOUNG_GIRL");
        b("Peach", hf.c0("Пич", "Принцесса Пич", "Princess Peach"), ki4Var3, "Princess", "ROYAL_QUEEN");
        b("Zelda", hf.c0("Зельда", "Принцесса Зельда", "Princess Zelda"), ki4Var3, "Princess", "ROYAL_QUEEN");
        b("Rosalina", hf.c0("Розалина", "Princess Rosalina"), ki4Var3, "Princess", "ROYAL_QUEEN");
        b("TomNook", hf.c0("Том Нук", "Нук", "Tom Nook"), ki4Var, "Merchant", "MERCHANT");
        b("Beedle", hf.c0("Бидл", "Торговец"), ki4Var, "Merchant", "MERCHANT");
        b("Captain", hf.c0("Капитан", "Командир", "Шериф", "Сержант"), ki4Var, "Soldier", "SOLDIER");
        b("Gordon", hf.c0("Гордон", "Комиссар Гордон"), ki4Var, "Soldier", "SOLDIER");
        b("Robo", hf.b0("Робо"), ki4Var2, "Robot", "CYBORG_ROBOT");
        b("Omega", hf.c0("Омега", "Omega-Xis", "E-123 Omega"), ki4Var2, "Robot", "CYBORG_ROBOT");
        b("Pokedex", hf.c0("Покедекс", "Pokédex", "Система", "Бортовой компьютер"), ki4Var2, "AI", "CYBORG_ROBOT");
        b("Franziska", hf.c0("Франциска", "Франциска фон Карма", "Franziska von Karma"), ki4Var3, "Prosecutor", "TSUNDERE");
        b("Shiki", hf.c0("Шики", "Shiki Misaki"), ki4Var3, "Partner", "TSUNDERE");
        b("Navi", hf.c0("Нави", "Hey Listen!"), ki4Var3, "Fairy", "CHEERFUL_FAIRY");
        b("Tatl", hf.b0("Татл"), ki4Var3, "Fairy", "CHEERFUL_FAIRY");
        b("Starlow", hf.b0("Старлоу"), ki4Var3, "Fairy", "CHEERFUL_FAIRY");
        b("GreatFairy", hf.b0("Великая Фея"), ki4Var3, "Fairy", "CHEERFUL_FAIRY");
        b("Celebi", hf.b0("Селеби"), ki4Var2, "Fairy", "CHEERFUL_FAIRY");
        b("Jirachi", hf.b0("Джирачи"), ki4Var2, "Fairy", "CHEERFUL_FAIRY");
        b("Syrup", hf.c0("Капитан Сироп", "Captain Syrup"), ki4Var3, "Pirate", "PIRATE");
        b("Tetra", hf.c0("Тетра", "Tetra"), ki4Var3, "Pirate", "PIRATE");
        b("Wily", hf.c0("Уайли", "Доктор Уайли", "Dr. Wily"), ki4Var, "Scientist", "MAD_SCIENTIST");
        b("Crygor", hf.c0("Крайгор", "Доктор Крайгор"), ki4Var, "Scientist", "MAD_SCIENTIST");
        b("Layton", hf.c0("Лейтон", "Профессор Лейтон", "Professor Layton"), ki4Var, "Scholar", "GENTLEMAN_SCHOLAR");
        b("Phoenix", hf.c0("Феникс", "Райт", "Феникс Райт", "Phoenix Wright", "Naruhodo"), ki4Var, "Lawyer", "GENTLEMAN_SCHOLAR");
        b("Miles", hf.c0("Эджворт", "Майлз", "Майлз Эджворт", "Miles Edgeworth", "Mitsurugi"), ki4Var, "Prosecutor", "GENTLEMAN_SCHOLAR");
        b("Godot", hf.c0("Годо", "Godot"), ki4Var, "Prosecutor", "GENTLEMAN_SCHOLAR");
        b("KingBoo", hf.c0("Кинг Бу", "Бу", "King Boo"), ki4Var, "Ghost", "GHOST_ETHEREAL");
        b("Gengar", hf.b0("Генгар"), ki4Var2, "Ghost", "GHOST_ETHEREAL");
        b("MetaKnight", hf.c0("Мета Найт", "Meta Knight"), ki4Var, "Knight", "KNIGHT_WARRIOR");
        b("Marth", hf.c0("Март", "Marth"), ki4Var, "Knight", "KNIGHT_WARRIOR");
        b("Ike", hf.c0("Айк", "Ike"), ki4Var, "Knight", "KNIGHT_WARRIOR");
        b("Wario", hf.c0("Варио", "Wario"), ki4Var, "Comedy", "COMEDY_GOOFY");
        b("Waluigi", hf.c0("Валуиджи", "Waluigi"), ki4Var, "Comedy", "COMEDY_GOOFY");
        b("Tingle", hf.c0("Тингл", "Tingle"), ki4Var, "Comedy", "COMEDY_GOOFY");
        b("Palutena", hf.c0("Палютена", "Богиня Палютена", "Lady Palutena"), ki4Var3, "Goddess", "ANGELIC_DIVINE");
        b("Hylia", hf.c0("Хайлия", "Богиня Хайлия", "Goddess Hylia"), ki4Var3, "Goddess", "ANGELIC_DIVINE");
        b("Pit", hf.c0("Пит", "Pit"), ki4Var, "Angel", "ANGELIC_DIVINE");
        b("Arceus", hf.c0("Аркеус", "Арцеус", "Arceus"), ki4Var2, "God", "ANGELIC_DIVINE");
        b("Samus", hf.c0("Самус", "Самус Аран", "Samus Aran"), ki4Var3, "Heroine", "PROTAGONIST_FEMALE");
        b("Shanoa", hf.c0("Шаноа", "Shanoa"), ki4Var3, "Heroine", "PROTAGONIST_FEMALE");
        b("Maya", hf.c0("Майя", "Майя Фей", "Maya Fey", "Mayoi"), ki4Var3, "Spirit Medium", "PROTAGONIST_FEMALE");
        b("Mia", hf.c0("Мия", "Мия Фей", "Mia Fey"), ki4Var3, "Mentor", "PROTAGONIST_FEMALE");
        b("Aqua", hf.c0("Аква", "Aqua"), ki4Var3, "Heroine", "PROTAGONIST_FEMALE");
        b("Mario", hf.c0("Марио", "Mario"), ki4Var, "Hero", "PROTAGONIST_MALE");
        b("Luigi", hf.c0("Луиджи", "Luigi"), ki4Var, "Hero", "PROTAGONIST_MALE");
        b("Link", hf.c0("Линк", "Link"), ki4Var, "Hero", "PROTAGONIST_MALE");
        b("Sonic", hf.c0("Соник", "Sonic the Hedgehog"), ki4Var, "Hero", "PROTAGONIST_MALE");
        b("Crono", hf.c0("Кроно", "Хроно", "Crono"), ki4Var, "Hero", "PROTAGONIST_MALE");
        b("Neku", hf.c0("Неку", "Neku Sakuraba"), ki4Var, "Hero", "PROTAGONIST_MALE");
        b("Sora", hf.c0("Сора", "Sora"), ki4Var, "Hero", "PROTAGONIST_MALE");
        linkedHashMap.put("batarang", "бэтаранг");
        linkedHashMap.put("batcave", "бэтпещера");
        linkedHashMap.put("pokeball", "покебол");
        linkedHashMap.put("pokédex", "покедекс");
        linkedHashMap.put("potion", "зелье");
        linkedHashMap.put("badge", "значок");
        linkedHashMap.put("gym leader", "лидер гима");
        linkedHashMap.put("court record", "материалы дела");
        linkedHashMap.put("attorney's badge", "значок адвоката");
        linkedHashMap.put("cross-examination", "перекрестный допрос");
        linkedHashMap.put("evidence", "улика");
        linkedHashMap.put("objection", "протестую");
        linkedHashMap.put("hold it", "постойте");
        linkedHashMap.put("take that", "получайте");
        linkedHashMap.put("picarats", "пикараты");
        linkedHashMap.put("hint coin", "монета-подсказка");
    }

    public static ji4 a(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        for (Map.Entry entry : a.entrySet()) {
            ji4 ji4Var = (ji4) entry.getValue();
            if (qs6.j0(lowerCase, (String) entry.getKey(), false)) {
                return ji4Var;
            }
        }
        return null;
    }

    public static void b(String str, List list, ki4 ki4Var, String str2, String str3) {
        ki4Var.getClass();
        ji4 ji4Var = new ji4(str, list, ki4Var, str2, str3);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        LinkedHashMap linkedHashMap = a;
        linkedHashMap.put(lowerCase, ji4Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            linkedHashMap.put(lowerCase2, ji4Var);
        }
    }
}
