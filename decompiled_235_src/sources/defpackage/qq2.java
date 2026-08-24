package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq2  reason: default package */
/* loaded from: classes.dex */
public final class qq2 {
    public final Activity a;
    public final SharedPreferences b;
    public TextToSpeech c;
    public boolean d;
    public List e;
    public final o41 f;
    public MediaPlayer g;
    public final LinkedHashMap h;
    public static final Set i = fv.V0(new String[]{"бэтмен", "бэтмэн", "брюс", "уэйн", "темный рыцарь", "гордон", "хайден", "кайл хайд", "снейк", "кратос", "вескер", "вейдер", "каратель", "аркхэм", "шедоу", "солид снейк", "биг босс", "batman", "bruce wayne", "dark knight", "gordon", "kyle hyde", "wesker", "vader", "solid snake", "shadow", "kratos", "punisher"});
    public static final Set j = fv.V0(new String[]{"джокер", "фофул", "клоун", "безумец", "псих", "маньяк", "загадочник", "риддлер", "кефка", "диментио", "порки", "валуиджи", "гирахим", "двуликий", "пугало", "крейн", "ха-ха", "хи-хи", "ахаха", "хе-хе", "хахаха", "муахаха", "joker", "fawful", "clown", "maniac", "riddler", "dimentio", "kefka", "porky", "waluigi", "ghirahim", "scarecrow", "haha", "hehe", "muahaha"});
    public static final Set k = fv.V0(new String[]{"босс", "король", "монстр", "дракон", "баузер", "боузер", "гетсис", "ганон", "ганондорф", "пингвин", "сайкс", "ксемнас", "ансем", "дидиди", "дедеде", "эггман", "варио", "джованни", "сокрушу", "ничтожества", "boss", "bowser", "ghetsis", "ganon", "ganondorf", "dedede", "eggman", "giovanni", "tyrant", "overlord"});
    public static final Set l = fv.V0(new String[]{"смерть", "демон", "дьявол", "сатана", "даркрай", "гиратина", "мьюту", "ридли", "акума", "бездна", "преисподняя", "тьма", "поглощу", "душа", "вампир", "нечисть", "проклятие", "некромант", "death", "dracula", "demon", "devil", "satan", "darkrai", "giratina", "mewtwo", "ridley", "akuma", "abyss", "curse", "vampire", "necromancer"});
    public static final Set m = fv.V0(new String[]{"дед", "старик", "мудрец", "оук", "роуэн", "джунипер", "бирч", "элм", "сикамор", "декард", "старец", "судья", "ваша честь", "elder", "sage", "oak", "rowan", "birch", "elm", "sycamore", "deckard", "judge", "your honor", "grandfather"});
    public static final Set n = fv.V0(new String[]{"люк", "тейлз", "тейлс", "несс", "лукас", "мальчик", "малыш", "парнишка", "братишка", "соник", "luke", "tails", "ness", "lucas", "boy", "kid", "child"});
    public static final Set o = fv.V0(new String[]{"перл", "эма", "флора", "нанами", "девочка", "малышка", "сестренка", "подружка", "pearl", "ema", "flora", "nanami", "girl", "little girl"});
    public static final Set p = fv.V0(new String[]{"пич", "зельда", "розалина", "принцесса", "королева", "госпожа", "ее величество", "леди", "правительница", "peach", "zelda", "rosalina", "princess", "queen", "lady", "majesty", "highness"});
    public static final Set q = fv.V0(new String[]{"торговец", "продавец", "том нук", "нук", "бидл", "магазин", "товары", "покупатель", "монеты", "купите", "продаю", "скидка", "merchant", "shopkeeper", "tom nook", "nook", "beedle", "shop", "goods", "customer", "coins", "discount"});
    public static final Set r = fv.V0(new String[]{"солдат", "стражник", "страж", "капитан", "командир", "сержант", "гвардеец", "патруль", "в ружье", "стоять", "пропуск", "soldier", "guard", "captain", "commander", "sergeant", "patrol", "halt", "sentry"});
    public static final Set s = fv.V0(new String[]{"робо", "омега", "покедекс", "компьютер", "робот", "дроид", "система", "протокол", "директива", "терминал", "инициализация", "robo", "omega", "pokedex", "computer", "robot", "droid", "system", "protocol", "directive", "terminal"});
    public static final Set t = fv.V0(new String[]{"франциска", "шики", "глупец", "ничтожество", "пф", "не подумай", "идиот", "нахал", "болван", "franziska", "shiki", "fool", "idiot", "hmph", "baka"});
    public static final Set u = fv.V0(new String[]{"шепот", "таинственный", "незнакомец", "тень", "призрак в капюшоне", "тихо...", "слышишь...", "секрет", "whisper", "mysterious", "shadow", "stranger", "secret", "hush"});
    public static final Set v = fv.V0(new String[]{"нави", "татл", "старлоу", "пикачу", "великая фея", "селеби", "джирачи", "пика-пика", "ура-а", "слушай!", "хей!", "navi", "tatl", "starlow", "pikachu", "fairy", "celebi", "jirachi", "listen", "hey"});
    public static final Set w = fv.V0(new String[]{"пират", "капитан сироп", "тетра", "море", "сокровища", "корабль", "на абордаж", "йо-хо-хо", "pirate", "syrup", "tetra", "sea", "treasure", "ship", "ahoy"});
    public static final Set x = fv.V0(new String[]{"доктор", "ученый", "уайли", "крайгор", "эксперимент", "изобретение", "гений науки", "моя лаборатория", "doctor", "scientist", "wily", "crygor", "experiment", "invention", "genius", "lab"});
    public static final Set y = fv.V0(new String[]{"лейтон", "профессор", "эджворт", "годо", "феникс", "райт", "челми", "детектив", "загадка", "головоломка", "протестую", "улика", "layton", "professor", "edgeworth", "godot", "phoenix", "wright", "puzzle", "gentleman", "objection", "evidence"});
    public static final Set z = fv.V0(new String[]{"призрак", "бу", "кинг бу", "генгар", "фантом", "дух", "загробный", "эфирный", "ghost", "boo", "king boo", "gengar", "phantom", "spirit", "ethereal"});
    public static final Set A = fv.V0(new String[]{"рыцарь", "воин", "мета найт", "март", "айк", "меч", "честь", "доблесть", "клинок", "knight", "warrior", "meta knight", "marth", "ike", "sword", "honor", "blade"});
    public static final Set B = fv.V0(new String[]{"варио", "валуиджи", "тингл", "смех", "комедия", "глупец", "золото!", "денюжки!", "wario", "waluigi", "tingle", "comedy", "fool", "gold", "money"});
    public static final Set C = fv.V0(new String[]{"палютена", "богиня", "хайлия", "аркеус", "пит", "ангел", "священный", "свет", "небеса", "храм", "молитва", "божественный", "palutena", "goddess", "hylia", "arceus", "pit", "angel", "holy", "light", "heavens", "divine"});
    public static final Set D = fv.V0(new String[]{"майя", "мия", "шаноа", "самус", "аква", "девушка", "женщина", "героиня", "спасите", "помогите", "maya", "mia", "shanoa", "samus", "aqua", "heroine", "woman"});
    public static final Set E = fv.V0(new String[]{"марио", "луиджи", "линк", "соник", "кроно", "хроно", "неку", "рокмен", "мегамен", "ред", "этан", "сора", "роксас", "mario", "luigi", "link", "sonic", "crono", "neku", "megaman", "red", "sora", "roxas", "hero"});

    public qq2(Activity activity) {
        this.a = activity;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(v15.b(activity), 0);
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        this.e = yt1.A;
        xe1 xe1Var = xk1.a;
        this.f = g04.i(de1.L);
        this.h = new LinkedHashMap();
        wk4 wk4Var = new wk4();
        wk4Var.a(6L);
        wk4Var.b(8L);
        new xk4(wk4Var);
        if (this.c == null) {
            this.c = new TextToSpeech(activity.getApplicationContext(), new iq2(this));
        }
        try {
            AssetManager assets = activity.getAssets();
            String[] list = assets.list("tts_models");
            if (list != null) {
                File externalFilesDir = activity.getExternalFilesDir("tts_models");
                if (externalFilesDir == null || (!externalFilesDir.exists() && !externalFilesDir.mkdirs())) {
                    externalFilesDir = new File(activity.getFilesDir(), "tts_models");
                    if (!externalFilesDir.exists()) {
                        externalFilesDir.mkdirs();
                    }
                }
                for (String str : list) {
                    File file = new File(externalFilesDir, str);
                    if (!file.exists()) {
                        InputStream open = assets.open("tts_models/" + str);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            open.getClass();
                            f04.w(open, fileOutputStream);
                            fileOutputStream.close();
                            open.close();
                            Log.i("LocalVoiceActorStudio", "Extracted bundled voice model: " + str + " (" + file.length() + " bytes)");
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ge7.t(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            Log.w("LocalVoiceActorStudio", "Bundled voice model asset scan skipped: " + th3.getMessage());
        }
    }

    public static kq2 b(String str) {
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        normalize.getClass();
        Pattern compile = Pattern.compile("\\p{Mn}+");
        compile.getClass();
        String replaceAll = compile.matcher(normalize).replaceAll("");
        replaceAll.getClass();
        String lowerCase = replaceAll.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!qs6.j0(lowerCase, "ха-ха", false) && !qs6.j0(lowerCase, "хи-хи", false) && !qs6.j0(lowerCase, "ахаха", false) && !qs6.j0(lowerCase, "муахаха", false) && !qs6.j0(lowerCase, "hahaha", false) && !qs6.j0(lowerCase, "шутка", false) && !qs6.j0(lowerCase, "ловушка", false)) {
            if (!qs6.j0(lowerCase, "протестую", false) && !qs6.j0(lowerCase, "objection", false) && !qs6.j0(lowerCase, "головоломка", false) && !qs6.j0(lowerCase, "загадка", false) && !qs6.j0(lowerCase, "джентльмен", false) && !qs6.j0(lowerCase, "улика", false)) {
                if (!qs6.j0(lowerCase, "покедекс", false) && !qs6.j0(lowerCase, "инициализация", false) && !qs6.j0(lowerCase, "протокол", false) && !qs6.j0(lowerCase, "директива", false)) {
                    Set<String> set = i;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        for (String str2 : set) {
                            if (qs6.j0(lowerCase, str2, false)) {
                                return kq2.HERO_DARK_VIGILANTE;
                            }
                        }
                    }
                    Set<String> set2 = j;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        for (String str3 : set2) {
                            if (qs6.j0(lowerCase, str3, false)) {
                                return kq2.VILLAIN_MANIC;
                            }
                        }
                    }
                    Set<String> set3 = k;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (String str4 : set3) {
                            if (qs6.j0(lowerCase, str4, false)) {
                                return kq2.VILLAIN_BOSS;
                            }
                        }
                    }
                    Set<String> set4 = l;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        for (String str5 : set4) {
                            if (qs6.j0(lowerCase, str5, false)) {
                                return kq2.DEEP_DEMON;
                            }
                        }
                    }
                    Set<String> set5 = m;
                    if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                        for (String str6 : set5) {
                            if (qs6.j0(lowerCase, str6, false)) {
                                return kq2.WISE_ELDER;
                            }
                        }
                    }
                    Set<String> set6 = n;
                    if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                        for (String str7 : set6) {
                            if (qs6.j0(lowerCase, str7, false)) {
                                return kq2.YOUNG_BOY;
                            }
                        }
                    }
                    Set<String> set7 = o;
                    if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                        for (String str8 : set7) {
                            if (qs6.j0(lowerCase, str8, false)) {
                                return kq2.YOUNG_GIRL;
                            }
                        }
                    }
                    Set<String> set8 = p;
                    if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                        for (String str9 : set8) {
                            if (qs6.j0(lowerCase, str9, false)) {
                                return kq2.ROYAL_QUEEN;
                            }
                        }
                    }
                    Set<String> set9 = q;
                    if (!(set9 instanceof Collection) || !set9.isEmpty()) {
                        for (String str10 : set9) {
                            if (qs6.j0(lowerCase, str10, false)) {
                                return kq2.MERCHANT;
                            }
                        }
                    }
                    Set<String> set10 = r;
                    if (!(set10 instanceof Collection) || !set10.isEmpty()) {
                        for (String str11 : set10) {
                            if (qs6.j0(lowerCase, str11, false)) {
                                return kq2.SOLDIER;
                            }
                        }
                    }
                    Set<String> set11 = s;
                    if (!(set11 instanceof Collection) || !set11.isEmpty()) {
                        for (String str12 : set11) {
                            if (qs6.j0(lowerCase, str12, false)) {
                                return kq2.CYBORG_ROBOT;
                            }
                        }
                    }
                    Set<String> set12 = t;
                    if (!(set12 instanceof Collection) || !set12.isEmpty()) {
                        for (String str13 : set12) {
                            if (qs6.j0(lowerCase, str13, false)) {
                                return kq2.TSUNDERE;
                            }
                        }
                    }
                    Set<String> set13 = u;
                    if (!(set13 instanceof Collection) || !set13.isEmpty()) {
                        for (String str14 : set13) {
                            if (qs6.j0(lowerCase, str14, false)) {
                                return kq2.WHISPER_MYSTERIOUS;
                            }
                        }
                    }
                    Set<String> set14 = v;
                    if (!(set14 instanceof Collection) || !set14.isEmpty()) {
                        for (String str15 : set14) {
                            if (qs6.j0(lowerCase, str15, false)) {
                                return kq2.CHEERFUL_FAIRY;
                            }
                        }
                    }
                    Set<String> set15 = w;
                    if (!(set15 instanceof Collection) || !set15.isEmpty()) {
                        for (String str16 : set15) {
                            if (qs6.j0(lowerCase, str16, false)) {
                                return kq2.PIRATE;
                            }
                        }
                    }
                    Set<String> set16 = x;
                    if (!(set16 instanceof Collection) || !set16.isEmpty()) {
                        for (String str17 : set16) {
                            if (qs6.j0(lowerCase, str17, false)) {
                                return kq2.MAD_SCIENTIST;
                            }
                        }
                    }
                    Set<String> set17 = y;
                    if (!(set17 instanceof Collection) || !set17.isEmpty()) {
                        for (String str18 : set17) {
                            if (qs6.j0(lowerCase, str18, false)) {
                                return kq2.GENTLEMAN_SCHOLAR;
                            }
                        }
                    }
                    Set<String> set18 = z;
                    if (!(set18 instanceof Collection) || !set18.isEmpty()) {
                        for (String str19 : set18) {
                            if (qs6.j0(lowerCase, str19, false)) {
                                return kq2.GHOST_ETHEREAL;
                            }
                        }
                    }
                    Set<String> set19 = A;
                    if (!(set19 instanceof Collection) || !set19.isEmpty()) {
                        for (String str20 : set19) {
                            if (qs6.j0(lowerCase, str20, false)) {
                                return kq2.KNIGHT_WARRIOR;
                            }
                        }
                    }
                    Set<String> set20 = B;
                    if (!(set20 instanceof Collection) || !set20.isEmpty()) {
                        for (String str21 : set20) {
                            if (qs6.j0(lowerCase, str21, false)) {
                                return kq2.COMEDY_GOOFY;
                            }
                        }
                    }
                    Set<String> set21 = C;
                    if (!(set21 instanceof Collection) || !set21.isEmpty()) {
                        for (String str22 : set21) {
                            if (qs6.j0(lowerCase, str22, false)) {
                                return kq2.ANGELIC_DIVINE;
                            }
                        }
                    }
                    Set<String> set22 = D;
                    if (!(set22 instanceof Collection) || !set22.isEmpty()) {
                        for (String str23 : set22) {
                            if (qs6.j0(lowerCase, str23, false)) {
                                return kq2.PROTAGONIST_FEMALE;
                            }
                        }
                    }
                    Set<String> set23 = E;
                    if (!(set23 instanceof Collection) || !set23.isEmpty()) {
                        for (String str24 : set23) {
                            if (qs6.j0(lowerCase, str24, false)) {
                                return kq2.PROTAGONIST_MALE;
                            }
                        }
                    }
                    return kq2.NARRATOR;
                }
                return kq2.CYBORG_ROBOT;
            }
            return kq2.GENTLEMAN_SCHOLAR;
        }
        return kq2.VILLAIN_MANIC;
    }

    public final void a(Locale locale) {
        Integer num;
        TextToSpeech textToSpeech;
        TextToSpeech textToSpeech2 = this.c;
        if (textToSpeech2 != null) {
            num = Integer.valueOf(textToSpeech2.setLanguage(locale));
        } else {
            num = null;
        }
        if (((num != null && num.intValue() == -1) || (num != null && num.intValue() == -2)) && (textToSpeech = this.c) != null) {
            textToSpeech.setLanguage(Locale.getDefault());
        }
    }

    public final kq2 c(String str, String str2) {
        if (!qs6.v0(str)) {
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            LinkedHashMap linkedHashMap = this.h;
            kq2 kq2Var = (kq2) linkedHashMap.get(lowerCase);
            if (kq2Var != null) {
                return kq2Var;
            }
            kq2 b = b(str);
            LinkedHashMap linkedHashMap2 = li4.a;
            String name = b.name();
            name.getClass();
            String lowerCase2 = qs6.T0(str).toString().toLowerCase(locale);
            lowerCase2.getClass();
            if (!qs6.v0(lowerCase2)) {
                LinkedHashMap linkedHashMap3 = li4.b;
                String str3 = (String) linkedHashMap3.get(lowerCase2);
                if (str3 != null) {
                    name = str3;
                } else {
                    ji4 a = li4.a(lowerCase2);
                    if (a != null) {
                        name = a.e;
                    }
                    linkedHashMap3.put(lowerCase2, name);
                    Log.i("OcrContextGraph", "Assigned consistent persona [" + name + "] to speaker [" + str + "]");
                }
            }
            kq2.Companion.getClass();
            kq2 a2 = jq2.a(name);
            linkedHashMap.put(lowerCase, a2);
            return a2;
        }
        kq2 b2 = b(str2);
        LinkedHashMap linkedHashMap4 = li4.a;
        String name2 = b2.name();
        str2.getClass();
        ji4 a3 = li4.a(str2);
        boolean z2 = false;
        if (a3 != null) {
            li4.c = a3;
            if (a3.c == ki4.MALE) {
                z2 = true;
            }
            li4.d = z2;
            name2 = a3.e;
        } else if (name2 != null && !name2.equals("NARRATOR") && !name2.equals("NARRATOR_CHRONICLE")) {
            li4.c = null;
        } else if (!xs6.g0(str2, "—", false) && !xs6.g0(str2, "-", false) && !xs6.g0(str2, "\"", false) && !xs6.g0(str2, "«", false)) {
            ji4 ji4Var = li4.c;
            if (ji4Var == null) {
                name2 = "NARRATOR";
            } else {
                name2 = ji4Var.e;
            }
            li4.c = null;
        } else {
            boolean z3 = li4.d;
            li4.d = !z3;
            if (!z3) {
                name2 = "PROTAGONIST_MALE";
            } else {
                name2 = "PROTAGONIST_FEMALE";
            }
        }
        kq2.Companion.getClass();
        return jq2.a(name2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018e, code lost:
        if (defpackage.qs6.v0(r1) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01af, code lost:
        if (defpackage.qs6.v0(r1) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cf, code lost:
        if (defpackage.qs6.v0(r1) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ef, code lost:
        if (defpackage.qs6.v0(r1) != false) goto L162;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(String str, String str2) {
        String str3;
        String P0;
        vr4 vr4Var;
        kq2 c;
        String str4;
        String lowerCase;
        str.getClass();
        str2.getClass();
        if (qs6.v0(str)) {
            return;
        }
        List<String> z0 = qs6.z0(str);
        ArrayList arrayList = new ArrayList(ht0.v0(z0, 10));
        for (String str5 : z0) {
            arrayList.add(qs6.T0(str5).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            vr4Var = new vr4("", str);
        } else {
            String str6 = (String) gt0.H0(arrayList2);
            String lowerCase2 = str6.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (qs6.j0(lowerCase2, ":", false)) {
                str3 = qs6.T0(qs6.Q0(str6, ":")).toString();
            } else if (qs6.j0(lowerCase2, "—", false) && lowerCase2.length() <= 25) {
                str3 = qs6.T0(qs6.Q0(str6, "—")).toString();
            } else if (xs6.g0(lowerCase2, "【", false) && qs6.j0(lowerCase2, "】", false)) {
                str3 = qs6.T0(qs6.Q0(qs6.N0(str6, "【", str6), "】")).toString();
            } else if (xs6.g0(lowerCase2, "[", false) && qs6.j0(lowerCase2, "]", false)) {
                str3 = qs6.T0(qs6.Q0(qs6.N0(str6, "[", str6), "]")).toString();
            } else if (xs6.g0(lowerCase2, "«", false) && qs6.j0(lowerCase2, "»", false)) {
                str3 = qs6.T0(qs6.Q0(qs6.N0(str6, "«", str6), "»")).toString();
            } else if (xs6.g0(lowerCase2, "(", false) && qs6.j0(lowerCase2, ")", false) && lowerCase2.length() <= 25) {
                str3 = qs6.T0(qs6.Q0(qs6.N0(str6, "(", str6), ")")).toString();
            } else if (arrayList2.size() < 2 || str6.length() > 22 || xs6.Y(str6, ".", false) || xs6.Y(str6, "?", false) || xs6.Y(str6, "!", false)) {
                str3 = "";
            } else {
                str3 = str6;
            }
            String obj2 = qs6.T0(str3).toString();
            if (obj2.length() > 0 && qs6.j0(str6, ":", false)) {
                P0 = qs6.T0(qs6.N0(str, ":", "")).toString();
            } else if (obj2.length() > 0 && qs6.j0(str6, "—", false)) {
                P0 = qs6.T0(qs6.N0(str, "—", "")).toString();
            } else if (obj2.length() > 0 && xs6.g0(str6, "【", false)) {
                P0 = qs6.T0(qs6.N0(str, "】", "")).toString();
            } else if (obj2.length() > 0 && xs6.g0(str6, "[", false)) {
                P0 = qs6.T0(qs6.N0(str, "]", "")).toString();
            } else {
                if (obj2.length() > 0 && arrayList2.size() >= 2 && str6.equals(obj2)) {
                    P0 = gt0.P0(gt0.D0(arrayList2, 1), "\n", null, null, null, 62);
                    vr4Var = new vr4(obj2, P0);
                }
                P0 = str;
                vr4Var = new vr4(obj2, P0);
            }
        }
        String str7 = (String) vr4Var.A;
        String str8 = (String) vr4Var.B;
        SharedPreferences sharedPreferences = this.b;
        boolean z2 = sharedPreferences.getBoolean("translator_local_voice_actor_studio", false);
        String string = sharedPreferences.getString("translator_local_voice_model", "auto_multi");
        if (string == null) {
            string = "auto_multi";
        }
        if (z2 && !string.equals("auto_multi")) {
            switch (string.hashCode()) {
                case -2051481880:
                    if (string.equals("piper_ru_dmitri_medium")) {
                        c = kq2.PROTAGONIST_MALE;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1970712543:
                    if (string.equals("piper_ru_whisper")) {
                        c = kq2.WHISPER_MYSTERIOUS;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1761360929:
                    if (string.equals("piper_ru_boss_grunt")) {
                        c = kq2.VILLAIN_BOSS;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1685655172:
                    if (string.equals("piper_ru_gentleman")) {
                        c = kq2.GENTLEMAN_SCHOLAR;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1506826647:
                    if (string.equals("piper_ru_elder")) {
                        c = kq2.WISE_ELDER;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1506225612:
                    if (string.equals("piper_ru_fairy")) {
                        c = kq2.CHEERFUL_FAIRY;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1505087762:
                    if (string.equals("piper_ru_ghost")) {
                        c = kq2.GHOST_ETHEREAL;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1494733111:
                    if (string.equals("piper_ru_robot")) {
                        c = kq2.CYBORG_ROBOT;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1129222582:
                    if (string.equals("piper_ru_narrator")) {
                        c = kq2.NARRATOR;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1034053048:
                    if (string.equals("piper_ru_mad_scientist")) {
                        c = kq2.MAD_SCIENTIST;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -1023038943:
                    if (string.equals("piper_ru_soldier")) {
                        c = kq2.SOLDIER;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -384829683:
                    if (string.equals("piper_ru_tsundere")) {
                        c = kq2.TSUNDERE;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case -187071557:
                    if (string.equals("piper_ru_hero")) {
                        c = kq2.PROTAGONIST_MALE;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 148550010:
                    if (string.equals("piper_ru_angelic")) {
                        c = kq2.ANGELIC_DIVINE;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 458287972:
                    if (string.equals("piper_ru_elena_medium")) {
                        c = kq2.PROTAGONIST_FEMALE;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 664319241:
                    if (string.equals("piper_ru_merchant")) {
                        c = kq2.MERCHANT;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 706786830:
                    if (string.equals("piper_ru_knight")) {
                        c = kq2.KNIGHT_WARRIOR;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 845577690:
                    if (string.equals("piper_ru_pirate")) {
                        c = kq2.PIRATE;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 1250004117:
                    if (string.equals("piper_ru_dark_knight")) {
                        c = kq2.HERO_DARK_VIGILANTE;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 1578171236:
                    if (string.equals("piper_ru_young_girl")) {
                        c = kq2.YOUNG_GIRL;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 1702975761:
                    if (string.equals("piper_ru_royal_queen")) {
                        c = kq2.ROYAL_QUEEN;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 1740037337:
                    if (string.equals("piper_ru_deep_demon")) {
                        c = kq2.DEEP_DEMON;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 2129114116:
                    if (string.equals("piper_ru_young_boy")) {
                        c = kq2.YOUNG_BOY;
                        break;
                    }
                    c = c(str7, str);
                    break;
                case 2135323847:
                    if (string.equals("piper_ru_joker_manic")) {
                        c = kq2.VILLAIN_MANIC;
                        break;
                    }
                    c = c(str7, str);
                    break;
                default:
                    c = c(str7, str);
                    break;
            }
        } else {
            c = c(str7, str);
        }
        Map map = d36.a;
        str8.getClass();
        if (qs6.v0(str8)) {
            str4 = str2;
        } else {
            for (vr4 vr4Var2 : d36.b) {
                str8 = ((Pattern) vr4Var2.A).matcher(str8).replaceAll((String) vr4Var2.B);
                str8.getClass();
            }
            str4 = str2;
            if (str4.equalsIgnoreCase("ru")) {
                for (vr4 vr4Var3 : d36.c) {
                    str8 = ((Pattern) vr4Var3.A).matcher(str8).replaceAll((String) vr4Var3.B);
                    str8.getClass();
                }
                for (Map.Entry entry : d36.a.entrySet()) {
                    String str9 = (String) entry.getValue();
                    Matcher matcher = Pattern.compile("(?i)\\b" + Pattern.quote((String) entry.getKey()) + "\\b").matcher(str8);
                    StringBuffer stringBuffer = new StringBuffer();
                    while (matcher.find()) {
                        String group = matcher.group();
                        group.getClass();
                        if (group.length() > 0 && Character.isUpperCase(group.charAt(0))) {
                            if (str9.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                String valueOf = String.valueOf(str9.charAt(0));
                                valueOf.getClass();
                                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                sb.append((Object) upperCase);
                                sb.append(str9.substring(1));
                                lowerCase = sb.toString();
                            } else {
                                lowerCase = str9;
                            }
                        } else {
                            lowerCase = str9.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        }
                        String quoteReplacement = Matcher.quoteReplacement(lowerCase);
                        quoteReplacement.getClass();
                        matcher.appendReplacement(stringBuffer, quoteReplacement);
                    }
                    matcher.appendTail(stringBuffer);
                    str8 = stringBuffer.toString();
                    str8.getClass();
                }
            }
            str8 = lb1.z("\\.{3,}", lb1.z("\\?{2,}", lb1.z("!{2,}", lb1.z("(?i)\\b([Tt])su\\b", lb1.z("(?i)\\b([Cc])hi\\b", lb1.z("(?i)\\b([Ss])hi\\b", str8, "$1i"), "ти"), "цу"), "!"), "?"), "...");
        }
        float p2 = gi2.p(sharedPreferences.getInt("translator_tts_speed", 100) / 100.0f, 0.6f, 1.8f);
        gi2.p(sharedPreferences.getInt("translator_local_voice_pitch_variance", 65) / 50.0f, 0.5f, 1.5f);
        c.getClass();
        String string2 = sharedPreferences.getString("translator_tts_voice_engine", "neural_edge");
        if (string2 == null) {
            string2 = "neural_edge";
        }
        if (string2.equals("neural_edge")) {
            hv.L(this.f, null, null, new vd1(p2, null, c, this, str4, str8), 3);
            return;
        }
        e(str8, c, p2, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(String str, kq2 kq2Var, float f, String str2) {
        Locale locale;
        boolean z2;
        TextToSpeech textToSpeech;
        Object obj;
        ArrayList arrayList;
        int i2;
        Set<String> features;
        TextToSpeech textToSpeech2 = this.c;
        if ((textToSpeech2 == null || !this.d) && textToSpeech2 == null) {
            this.c = new TextToSpeech(this.a.getApplicationContext(), new iq2(this));
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3201) {
            if (hashCode != 3241) {
                if (hashCode != 3246) {
                    if (hashCode != 3276) {
                        if (hashCode != 3371) {
                            if (hashCode != 3383) {
                                if (hashCode == 3886 && lowerCase.equals("zh")) {
                                    locale = Locale.CHINESE;
                                }
                                locale = new Locale("ru");
                            } else {
                                if (lowerCase.equals("ja")) {
                                    locale = Locale.JAPANESE;
                                }
                                locale = new Locale("ru");
                            }
                        } else {
                            if (lowerCase.equals("it")) {
                                locale = Locale.ITALIAN;
                            }
                            locale = new Locale("ru");
                        }
                    } else {
                        if (lowerCase.equals("fr")) {
                            locale = Locale.FRENCH;
                        }
                        locale = new Locale("ru");
                    }
                } else {
                    if (lowerCase.equals("es")) {
                        locale = new Locale("es");
                    }
                    locale = new Locale("ru");
                }
            } else {
                if (lowerCase.equals("en")) {
                    locale = Locale.ENGLISH;
                }
                locale = new Locale("ru");
            }
        } else {
            if (lowerCase.equals("de")) {
                locale = Locale.GERMAN;
            }
            locale = new Locale("ru");
        }
        locale.getClass();
        a(locale);
        List list = this.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Voice voice = (Voice) obj2;
            voice.getClass();
            if (nb3.k(voice.getLocale().getLanguage(), locale.getLanguage())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3 = i2) {
            Object obj3 = arrayList2.get(i3);
            int i4 = i3 + 1;
            Voice voice2 = (Voice) obj3;
            String name = voice2.getName();
            name.getClass();
            String lowerCase2 = name.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            int i5 = size;
            boolean z3 = false;
            if (!qs6.j0(lowerCase2, "rud", false) && !qs6.j0(lowerCase2, "rue", false) && !qs6.j0(lowerCase2, "male", false)) {
                i2 = i4;
                if (!qs6.j0(lowerCase2, "guy", false) && !qs6.j0(lowerCase2, "boy", false) && !qs6.j0(lowerCase2, "man", false) && !qs6.j0(lowerCase2, "dmitry", false) && !qs6.j0(lowerCase2, "alexander", false) && !qs6.j0(lowerCase2, "pavel", false) && !qs6.j0(lowerCase2, "maxim", false) && !qs6.j0(lowerCase2, "m-local", false)) {
                    if (qs6.j0(lowerCase2, "m-network", false) || ((features = voice2.getFeatures()) != null && features.contains("male"))) {
                        z3 = false;
                    }
                    size = i5;
                }
            } else {
                i2 = i4;
            }
            if (!qs6.j0(lowerCase2, "female", z3) && !qs6.j0(lowerCase2, "woman", z3) && !qs6.j0(lowerCase2, "girl", z3) && !qs6.j0(lowerCase2, "dfc", z3) && !qs6.j0(lowerCase2, "ruf", z3) && !qs6.j0(lowerCase2, "dfb", z3)) {
                arrayList3.add(obj3);
            }
            size = i5;
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj4 = arrayList2.get(i6);
            i6++;
            String name2 = ((Voice) obj4).getName();
            name2.getClass();
            String lowerCase3 = name2.toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            if (!qs6.j0(lowerCase3, "female", false) && !qs6.j0(lowerCase3, "woman", false) && !qs6.j0(lowerCase3, "girl", false) && !qs6.j0(lowerCase3, "dfc", false) && !qs6.j0(lowerCase3, "ruf", false) && !qs6.j0(lowerCase3, "dfb", false)) {
                arrayList = arrayList3;
                if (!qs6.j0(lowerCase3, "anna", false) && !qs6.j0(lowerCase3, "elena", false) && !qs6.j0(lowerCase3, "irina", false) && !qs6.j0(lowerCase3, "tatyana", false) && !qs6.j0(lowerCase3, "-f-", false)) {
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList3;
            }
            arrayList4.add(obj4);
            arrayList3 = arrayList;
        }
        Voice voice3 = (Voice) gt0.J0(arrayList3);
        if (voice3 == null) {
            int size3 = arrayList2.size();
            int i7 = 0;
            while (true) {
                if (i7 < size3) {
                    obj = arrayList2.get(i7);
                    i7++;
                    if (!arrayList4.contains((Voice) obj)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            voice3 = (Voice) obj;
        }
        Voice voice4 = (Voice) gt0.J0(arrayList4);
        if (voice4 == null) {
            voice4 = (Voice) gt0.J0(arrayList2);
        }
        switch (lq2.a[kq2Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z2 = false;
                break;
            default:
                z2 = true;
                break;
        }
        if (z2 && voice3 != null) {
            TextToSpeech textToSpeech3 = this.c;
            if (textToSpeech3 != null) {
                textToSpeech3.setVoice(voice3);
            }
        } else {
            if (!z2 && voice4 != null) {
                TextToSpeech textToSpeech4 = this.c;
                if (textToSpeech4 != null) {
                    textToSpeech4.setVoice(voice4);
                }
            }
            switch (lq2.a[kq2Var.ordinal()]) {
                case 1:
                    TextToSpeech textToSpeech5 = this.c;
                    if (textToSpeech5 != null) {
                        textToSpeech5.setPitch(1.22f);
                    }
                    TextToSpeech textToSpeech6 = this.c;
                    if (textToSpeech6 != null) {
                        textToSpeech6.setSpeechRate(f * 1.02f);
                        break;
                    }
                    break;
                case 2:
                    TextToSpeech textToSpeech7 = this.c;
                    if (textToSpeech7 != null) {
                        textToSpeech7.setPitch(1.75f);
                    }
                    TextToSpeech textToSpeech8 = this.c;
                    if (textToSpeech8 != null) {
                        textToSpeech8.setSpeechRate(f * 1.15f);
                        break;
                    }
                    break;
                case 3:
                    TextToSpeech textToSpeech9 = this.c;
                    if (textToSpeech9 != null) {
                        textToSpeech9.setPitch(1.15f);
                    }
                    TextToSpeech textToSpeech10 = this.c;
                    if (textToSpeech10 != null) {
                        textToSpeech10.setSpeechRate(f * 0.95f);
                        break;
                    }
                    break;
                case 4:
                    TextToSpeech textToSpeech11 = this.c;
                    if (textToSpeech11 != null) {
                        textToSpeech11.setPitch(1.35f);
                    }
                    TextToSpeech textToSpeech12 = this.c;
                    if (textToSpeech12 != null) {
                        textToSpeech12.setSpeechRate(f * 1.22f);
                        break;
                    }
                    break;
                case 5:
                    TextToSpeech textToSpeech13 = this.c;
                    if (textToSpeech13 != null) {
                        textToSpeech13.setPitch(1.85f);
                    }
                    TextToSpeech textToSpeech14 = this.c;
                    if (textToSpeech14 != null) {
                        textToSpeech14.setSpeechRate(f * 1.28f);
                        break;
                    }
                    break;
                case 6:
                    TextToSpeech textToSpeech15 = this.c;
                    if (textToSpeech15 != null) {
                        textToSpeech15.setPitch(1.4f);
                    }
                    TextToSpeech textToSpeech16 = this.c;
                    if (textToSpeech16 != null) {
                        textToSpeech16.setSpeechRate(f * 0.92f);
                        break;
                    }
                    break;
                case 7:
                    TextToSpeech textToSpeech17 = this.c;
                    if (textToSpeech17 != null) {
                        textToSpeech17.setPitch(0.4f);
                    }
                    TextToSpeech textToSpeech18 = this.c;
                    if (textToSpeech18 != null) {
                        textToSpeech18.setSpeechRate(f * 0.82f);
                        break;
                    }
                    break;
                case 8:
                    TextToSpeech textToSpeech19 = this.c;
                    if (textToSpeech19 != null) {
                        textToSpeech19.setPitch(0.35f);
                    }
                    TextToSpeech textToSpeech20 = this.c;
                    if (textToSpeech20 != null) {
                        textToSpeech20.setSpeechRate(f * 0.76f);
                        break;
                    }
                    break;
                case 9:
                    TextToSpeech textToSpeech21 = this.c;
                    if (textToSpeech21 != null) {
                        textToSpeech21.setPitch(1.42f);
                    }
                    TextToSpeech textToSpeech22 = this.c;
                    if (textToSpeech22 != null) {
                        textToSpeech22.setSpeechRate(f * 1.34f);
                        break;
                    }
                    break;
                case 10:
                    TextToSpeech textToSpeech23 = this.c;
                    if (textToSpeech23 != null) {
                        textToSpeech23.setPitch(0.28f);
                    }
                    TextToSpeech textToSpeech24 = this.c;
                    if (textToSpeech24 != null) {
                        textToSpeech24.setSpeechRate(f * 0.68f);
                        break;
                    }
                    break;
                case 11:
                    TextToSpeech textToSpeech25 = this.c;
                    if (textToSpeech25 != null) {
                        textToSpeech25.setPitch(0.55f);
                    }
                    TextToSpeech textToSpeech26 = this.c;
                    if (textToSpeech26 != null) {
                        textToSpeech26.setSpeechRate(f * 0.8f);
                        break;
                    }
                    break;
                case 12:
                    TextToSpeech textToSpeech27 = this.c;
                    if (textToSpeech27 != null) {
                        textToSpeech27.setPitch(1.65f);
                    }
                    TextToSpeech textToSpeech28 = this.c;
                    if (textToSpeech28 != null) {
                        textToSpeech28.setSpeechRate(f * 1.18f);
                        break;
                    }
                    break;
                case 13:
                    TextToSpeech textToSpeech29 = this.c;
                    if (textToSpeech29 != null) {
                        textToSpeech29.setPitch(1.1f);
                    }
                    TextToSpeech textToSpeech30 = this.c;
                    if (textToSpeech30 != null) {
                        textToSpeech30.setSpeechRate(f * 1.25f);
                        break;
                    }
                    break;
                case 14:
                    TextToSpeech textToSpeech31 = this.c;
                    if (textToSpeech31 != null) {
                        textToSpeech31.setPitch(0.7f);
                    }
                    TextToSpeech textToSpeech32 = this.c;
                    if (textToSpeech32 != null) {
                        textToSpeech32.setSpeechRate(f * 1.05f);
                        break;
                    }
                    break;
                case 15:
                    TextToSpeech textToSpeech33 = this.c;
                    if (textToSpeech33 != null) {
                        textToSpeech33.setPitch(0.42f);
                    }
                    TextToSpeech textToSpeech34 = this.c;
                    if (textToSpeech34 != null) {
                        textToSpeech34.setSpeechRate(f * 1.02f);
                        break;
                    }
                    break;
                case 16:
                    TextToSpeech textToSpeech35 = this.c;
                    if (textToSpeech35 != null) {
                        textToSpeech35.setPitch(0.9f);
                    }
                    TextToSpeech textToSpeech36 = this.c;
                    if (textToSpeech36 != null) {
                        textToSpeech36.setSpeechRate(f * 0.7f);
                        break;
                    }
                    break;
                case 17:
                    TextToSpeech textToSpeech37 = this.c;
                    if (textToSpeech37 != null) {
                        textToSpeech37.setPitch(0.85f);
                    }
                    TextToSpeech textToSpeech38 = this.c;
                    if (textToSpeech38 != null) {
                        textToSpeech38.setSpeechRate(f * 1.12f);
                        break;
                    }
                    break;
                case 18:
                    TextToSpeech textToSpeech39 = this.c;
                    if (textToSpeech39 != null) {
                        textToSpeech39.setPitch(1.32f);
                    }
                    TextToSpeech textToSpeech40 = this.c;
                    if (textToSpeech40 != null) {
                        textToSpeech40.setSpeechRate(f * 1.24f);
                        break;
                    }
                    break;
                case 19:
                    TextToSpeech textToSpeech41 = this.c;
                    if (textToSpeech41 != null) {
                        textToSpeech41.setPitch(0.76f);
                    }
                    TextToSpeech textToSpeech42 = this.c;
                    if (textToSpeech42 != null) {
                        textToSpeech42.setSpeechRate(f * 0.88f);
                        break;
                    }
                    break;
                case 20:
                    TextToSpeech textToSpeech43 = this.c;
                    if (textToSpeech43 != null) {
                        textToSpeech43.setPitch(1.15f);
                    }
                    TextToSpeech textToSpeech44 = this.c;
                    if (textToSpeech44 != null) {
                        textToSpeech44.setSpeechRate(f * 0.68f);
                        break;
                    }
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    TextToSpeech textToSpeech45 = this.c;
                    if (textToSpeech45 != null) {
                        textToSpeech45.setPitch(0.8f);
                    }
                    TextToSpeech textToSpeech46 = this.c;
                    if (textToSpeech46 != null) {
                        textToSpeech46.setSpeechRate(f * 0.95f);
                        break;
                    }
                    break;
                case 22:
                    TextToSpeech textToSpeech47 = this.c;
                    if (textToSpeech47 != null) {
                        textToSpeech47.setPitch(1.45f);
                    }
                    TextToSpeech textToSpeech48 = this.c;
                    if (textToSpeech48 != null) {
                        textToSpeech48.setSpeechRate(f * 1.32f);
                        break;
                    }
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    TextToSpeech textToSpeech49 = this.c;
                    if (textToSpeech49 != null) {
                        textToSpeech49.setPitch(0.88f);
                    }
                    TextToSpeech textToSpeech50 = this.c;
                    if (textToSpeech50 != null) {
                        textToSpeech50.setSpeechRate(f * 1.0f);
                        break;
                    }
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    TextToSpeech textToSpeech51 = this.c;
                    if (textToSpeech51 != null) {
                        textToSpeech51.setPitch(0.98f);
                    }
                    TextToSpeech textToSpeech52 = this.c;
                    if (textToSpeech52 != null) {
                        textToSpeech52.setSpeechRate(f);
                        break;
                    }
                    break;
                default:
                    i.d();
                    return;
            }
            textToSpeech = this.c;
            if (textToSpeech == null) {
                textToSpeech.speak(str, 0, null, lb1.h(System.currentTimeMillis(), "game_tts_multi_"));
                return;
            }
            return;
        }
        switch (lq2.a[kq2Var.ordinal()]) {
        }
        textToSpeech = this.c;
        if (textToSpeech == null) {
        }
    }
}
