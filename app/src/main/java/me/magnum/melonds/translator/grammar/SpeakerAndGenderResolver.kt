package me.magnum.melonds.translator.grammar

import me.magnum.melonds.translator.glossary.UserGlossaryManager
import me.magnum.melonds.translator.model.TranslatedTextBlock
import java.util.Locale
import java.util.regex.Pattern

/**
 * Speaker Nameplate Extractor, Nintendo DS Character Gender Resolver,
 * and Contextual Gender Inference Engine.
 */
object SpeakerAndGenderResolver {

    // Regex for inline speaker prefix patterns:
    // "Phoenix: Objection!", "[Maya] Look!", "【Miles】 Indeed.", "«Apollo»: I'm fine!", "Edgeworth — No."
    private val INLINE_SPEAKER_REGEX = Pattern.compile(
        "^\\s*(?:【([^】]{2,30})】|\\[([^\\]]{2,30})\\]|«([^»]{2,30})»|([A-Za-zА-Яа-яЁё0-9_\\-'.\\s]{2,25})[:—–-])\\s*(.*)$"
    )

    // Male honorifics and title cues
    private val MALE_TITLE_CUES = listOf(
        "mr.", "mister", "lord", "sir", "king", "prince", "father", "brother",
        "uncle", "boy", "baron", "duke", "emperor", "pope", "monk", "master",
        "grandpa", "grandfather", "son", "guy", "man", "-kun", " ore ", " boku "
    )

    // Female honorifics and title cues
    private val FEMALE_TITLE_CUES = listOf(
        "ms.", "mrs.", "miss", "lady", "queen", "princess", "sister", "mother",
        "aunt", "girl", "maiden", "witch", "priestess", "empress", "duchess",
        "madam", "madame", "grandma", "grandmother", "daughter", "woman",
        "-chan", "-sama", " atashi ", " ojou ", " ojou-sama "
    )

    // Comprehensive 300+ Nintendo DS Character Gender Dictionary (English & Russian names)
    private val BUILTIN_DS_CHARACTERS = mapOf(
        // Ace Attorney Franchise
        "phoenix" to Gender.MALE, "phoenix wright" to Gender.MALE, "феникс" to Gender.MALE, "феникс райт" to Gender.MALE,
        "maya" to Gender.FEMALE, "maya fey" to Gender.FEMALE, "майя" to Gender.FEMALE, "майя фей" to Gender.FEMALE,
        "mia" to Gender.FEMALE, "mia fey" to Gender.FEMALE, "мия" to Gender.FEMALE, "мия фей" to Gender.FEMALE,
        "edgeworth" to Gender.MALE, "miles" to Gender.MALE, "miles edgeworth" to Gender.MALE, "майлз" to Gender.MALE, "майлз эджворт" to Gender.MALE, "эджворт" to Gender.MALE,
        "franziska" to Gender.FEMALE, "franziska von karma" to Gender.FEMALE, "франциска" to Gender.FEMALE, "франциска фон карма" to Gender.FEMALE,
        "pearl" to Gender.FEMALE, "pearl fey" to Gender.FEMALE, "пёрл" to Gender.FEMALE, "перл" to Gender.FEMALE, "перл фей" to Gender.FEMALE,
        "ema" to Gender.FEMALE, "ema skye" to Gender.FEMALE, "эма" to Gender.FEMALE, "эма скай" to Gender.FEMALE,
        "apollo" to Gender.MALE, "apollo justice" to Gender.MALE, "аполло" to Gender.MALE, "аполло джастис" to Gender.MALE,
        "trucy" to Gender.FEMALE, "trucy wright" to Gender.FEMALE, "трюси" to Gender.FEMALE, "труси" to Gender.FEMALE,
        "kay" to Gender.FEMALE, "kay faraday" to Gender.FEMALE, "кей" to Gender.FEMALE, "кей фарадей" to Gender.FEMALE,
        "gumshoe" to Gender.MALE, "dick gumshoe" to Gender.MALE, "гамшу" to Gender.MALE, "дик гамшу" to Gender.MALE,
        "godot" to Gender.MALE, "годо" to Gender.MALE, "диего армандо" to Gender.MALE, "diego armando" to Gender.MALE,
        "dahlia" to Gender.FEMALE, "dahlia hawthorne" to Gender.FEMALE, "далия" to Gender.FEMALE, "далия хоторн" to Gender.FEMALE,
        "iris" to Gender.FEMALE, "айрис" to Gender.FEMALE,
        "larry" to Gender.MALE, "larry butz" to Gender.MALE, "ларри" to Gender.MALE, "ларри бац" to Gender.MALE,
        "judge" to Gender.MALE, "судья" to Gender.MALE,
        "klavier" to Gender.MALE, "klavier gavin" to Gender.MALE, "клавир" to Gender.MALE, "клавир гэвин" to Gender.MALE,
        "kristoph" to Gender.MALE, "kristoph gavin" to Gender.MALE, "кристоф" to Gender.MALE, "кристоф гэвин" to Gender.MALE,
        "manfred" to Gender.MALE, "manfred von karma" to Gender.MALE, "манфред" to Gender.MALE,
        "wendy oldbag" to Gender.FEMALE, "oldbag" to Gender.FEMALE, "олдбэг" to Gender.FEMALE,
        "matt engarde" to Gender.MALE, "engarde" to Gender.MALE, "энгард" to Gender.MALE,
        "adrian" to Gender.FEMALE, "adrian andrews" to Gender.FEMALE, "эдриан" to Gender.FEMALE, "эдриан эндрюс" to Gender.FEMALE,
        "ron delite" to Gender.MALE, "delite" to Gender.MALE, "рон делайт" to Gender.MALE,
        "desiree" to Gender.FEMALE, "desirée" to Gender.FEMALE, "дезире" to Gender.FEMALE,
        "luke atmey" to Gender.MALE, "atmey" to Gender.MALE, "люк этми" to Gender.MALE,
        "furio tigre" to Gender.MALE, "тигре" to Gender.MALE,
        "maggey" to Gender.FEMALE, "maggey byrde" to Gender.FEMALE, "мэгги" to Gender.FEMALE, "мэгги бёрд" to Gender.FEMALE,
        "shi-long lang" to Gender.MALE, "lang" to Gender.MALE, "ланг" to Gender.MALE, "ши-лун ланг" to Gender.MALE,
        "tyrell badd" to Gender.MALE, "badd" to Gender.MALE, "бэдд" to Gender.MALE,
        "calisto yew" to Gender.FEMALE, "yew" to Gender.FEMALE, "кэлисто" to Gender.FEMALE,
        "colias palaeno" to Gender.MALE, "palaeno" to Gender.MALE, "палено" to Gender.MALE,
        "quercus alba" to Gender.MALE, "alba" to Gender.MALE, "альба" to Gender.MALE,
        "gregory edgeworth" to Gender.MALE, "грегори эджворт" to Gender.MALE,
        "raymond shields" to Gender.MALE, "ray shields" to Gender.MALE, "шилдс" to Gender.MALE,
        "sebastian debeste" to Gender.MALE, "debeste" to Gender.MALE, "дебест" to Gender.MALE,
        "justine courtney" to Gender.FEMALE, "courtney" to Gender.FEMALE, "кортни" to Gender.FEMALE, "джастин кортни" to Gender.FEMALE,
        "blaise debeste" to Gender.MALE, "блейз" to Gender.MALE,
        "simon keyes" to Gender.MALE, "саймон киз" to Gender.MALE,

        // Professor Layton Franchise
        "layton" to Gender.MALE, "hershel layton" to Gender.MALE, "лейтон" to Gender.MALE, "профессор лейтон" to Gender.MALE,
        "luke" to Gender.MALE, "luke triton" to Gender.MALE, "люк" to Gender.MALE, "люк тритон" to Gender.MALE,
        "flora" to Gender.FEMALE, "flora reinhold" to Gender.FEMALE, "флора" to Gender.FEMALE, "флора рейнхольд" to Gender.FEMALE,
        "emmy" to Gender.FEMALE, "emmy altava" to Gender.FEMALE, "эмми" to Gender.FEMALE, "эмми альтава" to Gender.FEMALE,
        "descole" to Gender.MALE, "jean descole" to Gender.MALE, "дескоул" to Gender.MALE, "жан дескоул" to Gender.MALE,
        "claire" to Gender.FEMALE, "клэр" to Gender.FEMALE,
        "don paolo" to Gender.MALE, "дон паоло" to Gender.MALE,
        "chelmey" to Gender.MALE, "инспектор челми" to Gender.MALE, "челми" to Gender.MALE,
        "barton" to Gender.MALE, "констебль бартон" to Gender.MALE, "бартон" to Gender.MALE,
        "anton" to Gender.MALE, "anton herzog" to Gender.MALE, "антон" to Gender.MALE,
        "sophia" to Gender.FEMALE, "софия" to Gender.FEMALE,
        "katia" to Gender.FEMALE, "катя" to Gender.FEMALE,
        "dimitri" to Gender.MALE, "dimitri allen" to Gender.MALE, "димитрий" to Gender.MALE,
        "clive" to Gender.MALE, "clive dove" to Gender.MALE, "клайв" to Gender.MALE,
        "randall" to Gender.MALE, "рэндалл" to Gender.MALE,
        "henry" to Gender.MALE, "генри" to Gender.MALE,
        "angela" to Gender.FEMALE, "анджела" to Gender.FEMALE,

        // Chrono Trigger DS
        "crono" to Gender.MALE, "хроно" to Gender.MALE,
        "marle" to Gender.FEMALE, "марл" to Gender.FEMALE, "надя" to Gender.FEMALE,
        "lucca" to Gender.FEMALE, "лукка" to Gender.FEMALE,
        "frog" to Gender.MALE, "фрог" to Gender.MALE, "glenn" to Gender.MALE, "гленн" to Gender.MALE,
        "robo" to Gender.MALE, "робо" to Gender.MALE,
        "ayla" to Gender.FEMALE, "эйла" to Gender.FEMALE,
        "magus" to Gender.MALE, "магус" to Gender.MALE, "янус" to Gender.MALE,
        "schala" to Gender.FEMALE, "шала" to Gender.FEMALE,
        "dalton" to Gender.MALE, "дальтон" to Gender.MALE,
        "ozzie" to Gender.MALE, "оззи" to Gender.MALE,
        "flea" to Gender.MALE, "фли" to Gender.MALE,
        "slash" to Gender.MALE, "слэш" to Gender.MALE,
        "gaspar" to Gender.MALE, "гаспар" to Gender.MALE,
        "melchior" to Gender.MALE, "мельхиор" to Gender.MALE,
        "belthasar" to Gender.MALE, "бальтазар" to Gender.MALE,
        "queen zeal" to Gender.FEMALE, "королева зил" to Gender.FEMALE,
        "cyrus" to Gender.MALE, "сайрус" to Gender.MALE,

        // Pokémon Franchise (Diamond/Pearl/Platinum/HGSS/BW/B2W2)
        "dawn" to Gender.FEMALE, "доун" to Gender.FEMALE,
        "lucas" to Gender.MALE, "лукас" to Gender.MALE,
        "cynthia" to Gender.FEMALE, "синтия" to Gender.FEMALE,
        "lyra" to Gender.FEMALE, "лайра" to Gender.FEMALE,
        "ethan" to Gender.MALE, "итан" to Gender.MALE,
        "hilda" to Gender.FEMALE, "хильда" to Gender.FEMALE,
        "hilbert" to Gender.MALE, "хилберт" to Gender.MALE,
        "rosa" to Gender.FEMALE, "роза" to Gender.FEMALE,
        "nate" to Gender.MALE, "нейт" to Gender.MALE,
        "bianca" to Gender.FEMALE, "бьянка" to Gender.FEMALE,
        "cheren" to Gender.MALE, "черен" to Gender.MALE,
        "n" to Gender.MALE,
        "barry" to Gender.MALE, "барри" to Gender.MALE,
        "silver" to Gender.MALE, "сильвер" to Gender.MALE,
        "red" to Gender.MALE, "ред" to Gender.MALE,
        "blue" to Gender.MALE, "блю" to Gender.MALE,
        "lance" to Gender.MALE, "лэнс" to Gender.MALE,
        "steven" to Gender.MALE, "стивен" to Gender.MALE,
        "alder" to Gender.MALE, "алдер" to Gender.MALE,
        "ghetsis" to Gender.MALE, "гетсис" to Gender.MALE,
        "colress" to Gender.MALE, "колресс" to Gender.MALE,
        "hugh" to Gender.MALE, "хью" to Gender.MALE,
        "elesa" to Gender.FEMALE, "элеса" to Gender.FEMALE,
        "skyla" to Gender.FEMALE, "скайла" to Gender.FEMALE,
        "roxie" to Gender.FEMALE, "рокси" to Gender.FEMALE,
        "shauntal" to Gender.FEMALE, "шантал" to Gender.FEMALE,
        "caitlin" to Gender.FEMALE, "кейтлин" to Gender.FEMALE,
        "looker" to Gender.MALE, "лукер" to Gender.MALE,
        "rowan" to Gender.MALE, "роуэн" to Gender.MALE,
        "juniper" to Gender.FEMALE, "джунипер" to Gender.FEMALE,

        // The World Ends With You (TWEWY)
        "neku" to Gender.MALE, "neku sakuraba" to Gender.MALE, "неку" to Gender.MALE, "неку сакураба" to Gender.MALE,
        "shiki" to Gender.FEMALE, "shiki misaki" to Gender.FEMALE, "шики" to Gender.FEMALE, "сики" to Gender.FEMALE,
        "joshua" to Gender.MALE, "джошуа" to Gender.MALE,
        "beat" to Gender.MALE, "бит" to Gender.MALE,
        "rhyme" to Gender.FEMALE, "райм" to Gender.FEMALE,
        "hanekoma" to Gender.MALE, "санаэ ханекома" to Gender.MALE, "ханекома" to Gender.MALE,
        "kitaniji" to Gender.MALE, "китанидзи" to Gender.MALE,
        "konishi" to Gender.FEMALE, "кониси" to Gender.FEMALE,
        "minamimoto" to Gender.MALE, "шо минамимото" to Gender.MALE, "минамимото" to Gender.MALE,
        "uzuki" to Gender.FEMALE, "удзуки ясиро" to Gender.FEMALE, "удзуки" to Gender.FEMALE,
        "kariya" to Gender.MALE, "коки кария" to Gender.MALE, "кария" to Gender.MALE,

        // Ghost Trick: Phantom Detective
        "sissel" to Gender.MALE, "сиссель" to Gender.MALE,
        "lynne" to Gender.FEMALE, "линн" to Gender.FEMALE,
        "kamila" to Gender.FEMALE, "камила" to Gender.FEMALE,
        "missile" to Gender.MALE, "миссайл" to Gender.MALE,
        "jowd" to Gender.MALE, "джоуд" to Gender.MALE,
        "cabanela" to Gender.MALE, "кабанела" to Gender.MALE,
        "yomiel" to Gender.MALE, "йомиэль" to Gender.MALE,
        "alma" to Gender.FEMALE, "альма" to Gender.FEMALE,
        "amelie" to Gender.FEMALE, "амели" to Gender.FEMALE,
        "bailey" to Gender.MALE, "бейли" to Gender.MALE,

        // 999: Nine Hours, Nine Persons, Nine Doors
        "junpei" to Gender.MALE, "дзюнпей" to Gender.MALE, "джунпей" to Gender.MALE,
        "akane" to Gender.FEMALE, "akane kurashiki" to Gender.FEMALE, "аканэ" to Gender.FEMALE,
        "june" to Gender.FEMALE, "джун" to Gender.FEMALE,
        "clover" to Gender.FEMALE, "кловер" to Gender.FEMALE,
        "lotus" to Gender.FEMALE, "лотус" to Gender.FEMALE,
        "seven" to Gender.MALE, "севен" to Gender.MALE,
        "santa" to Gender.MALE, "aoi kurashiki" to Gender.MALE, "санта" to Gender.MALE,
        "ace" to Gender.MALE, "gentarou hongou" to Gender.MALE, "эйс" to Gender.MALE,
        "snake" to Gender.MALE, "light" to Gender.MALE, "снейк" to Gender.MALE,

        // Radiant Historia
        "stocke" to Gender.MALE, "сток" to Gender.MALE,
        "raynie" to Gender.FEMALE, "рейни" to Gender.FEMALE,
        "marco" to Gender.MALE, "марко" to Gender.MALE,
        "eruca" to Gender.FEMALE, "эрука" to Gender.FEMALE,
        "aht" to Gender.FEMALE, "ахт" to Gender.FEMALE,
        "rosch" to Gender.MALE, "рош" to Gender.MALE,
        "heiss" to Gender.MALE, "хейсс" to Gender.MALE,
        "sonja" to Gender.FEMALE, "соня" to Gender.FEMALE,
        "kiel" to Gender.MALE, "киль" to Gender.MALE,
        "viola" to Gender.FEMALE, "виола" to Gender.FEMALE,
        "noah" to Gender.MALE, "ной" to Gender.MALE,
        "protea" to Gender.FEMALE, "протея" to Gender.FEMALE,
        "lippti" to Gender.FEMALE, "липпти" to Gender.FEMALE,
        "teo" to Gender.MALE, "тео" to Gender.MALE,

        // Castlevania DS (Dawn of Sorrow, Portrait of Ruin, Order of Ecclesia)
        "soma" to Gender.MALE, "soma cruz" to Gender.MALE, "сома" to Gender.MALE, "сома круз" to Gender.MALE,
        "mina" to Gender.FEMALE, "mina hakuba" to Gender.FEMALE, "мина" to Gender.FEMALE, "мина хакуба" to Gender.FEMALE,
        "celia" to Gender.FEMALE, "celia fortner" to Gender.FEMALE, "селия" to Gender.FEMALE,
        "yoko" to Gender.FEMALE, "yoko belnades" to Gender.FEMALE, "йоко" to Gender.FEMALE, "йоко белнадес" to Gender.FEMALE,
        "julius" to Gender.MALE, "julius belmont" to Gender.MALE, "юлиус" to Gender.MALE, "юлиус бельмонт" to Gender.MALE,
        "jonathan" to Gender.MALE, "jonathan morris" to Gender.MALE, "джонатан" to Gender.MALE, "джонатан моррис" to Gender.MALE,
        "charlotte" to Gender.FEMALE, "charlotte aulin" to Gender.FEMALE, "шарлотта" to Gender.FEMALE, "шарлотта олин" to Gender.FEMALE,
        "shanoa" to Gender.FEMALE, "шаноа" to Gender.FEMALE,
        "albus" to Gender.MALE, "альбус" to Gender.MALE,
        "barlowe" to Gender.MALE, "барлоу" to Gender.MALE,
        "hammer" to Gender.MALE, "хаммер" to Gender.MALE,
        "arikado" to Gender.MALE, "genya arikado" to Gender.MALE, "арикадо" to Gender.MALE,
        "brauner" to Gender.MALE, "браунер" to Gender.MALE,
        "loretta" to Gender.FEMALE, "лоретта" to Gender.FEMALE,
        "stella" to Gender.FEMALE, "стелла" to Gender.FEMALE,
        "vincent" to Gender.MALE, "винсент" to Gender.MALE,
        "wind" to Gender.MALE, "eric lecarde" to Gender.MALE, "винд" to Gender.MALE,

        // Final Fantasy III, IV, XII: Revenant Wings, Tactics A2
        "luneth" to Gender.MALE, "лунет" to Gender.MALE,
        "arc" to Gender.MALE, "арк" to Gender.MALE,
        "refia" to Gender.FEMALE, "рефия" to Gender.FEMALE,
        "ingus" to Gender.MALE, "ингус" to Gender.MALE,
        "cecil" to Gender.MALE, "сесил" to Gender.MALE,
        "rosa" to Gender.FEMALE, "роза фаррелл" to Gender.FEMALE,
        "rydia" to Gender.FEMALE, "ридия" to Gender.FEMALE,
        "kain" to Gender.MALE, "каин" to Gender.MALE,
        "edge" to Gender.MALE, "эдж" to Gender.MALE,
        "vaan" to Gender.MALE, "ваан" to Gender.MALE,
        "penelo" to Gender.FEMALE, "пенело" to Gender.FEMALE,
        "fran" to Gender.FEMALE, "фран" to Gender.FEMALE,
        "ashe" to Gender.FEMALE, "эш" to Gender.FEMALE,
        "balthier" to Gender.MALE, "балтиер" to Gender.MALE,
        "basch" to Gender.MALE, "баш" to Gender.MALE,
        "luso" to Gender.MALE, "luso clemens" to Gender.MALE, "лусо" to Gender.MALE,
        "adelle" to Gender.FEMALE, "адель" to Gender.FEMALE,
        "hurdy" to Gender.MALE, "хёрди" to Gender.MALE,
        "montblanc" to Gender.MALE, "монблан" to Gender.MALE,
        "illua" to Gender.FEMALE, "иллуа" to Gender.FEMALE,
        "frimelda" to Gender.FEMALE, "фримельда" to Gender.FEMALE,

        // Dragon Quest IV, V, VI, IX
        "solo" to Gender.MALE, "соло" to Gender.MALE,
        "sofia" to Gender.FEMALE, "софия" to Gender.FEMALE,
        "alena" to Gender.FEMALE, "алёна" to Gender.FEMALE, "алена" to Gender.FEMALE,
        "kiryl" to Gender.MALE, "кирилл" to Gender.MALE,
        "borya" to Gender.MALE, "боря" to Gender.MALE,
        "torneko" to Gender.MALE, "торнеко" to Gender.MALE,
        "ragnar" to Gender.MALE, "рагнар" to Gender.MALE,
        "meena" to Gender.FEMALE, "мина" to Gender.FEMALE,
        "nera" to Gender.FEMALE, "нера" to Gender.FEMALE,
        "debora" to Gender.FEMALE, "дебора" to Gender.FEMALE,
        "milly" to Gender.FEMALE, "милли" to Gender.FEMALE,
        "ashlynn" to Gender.FEMALE, "эшлинн" to Gender.FEMALE,
        "carver" to Gender.MALE, "карвер" to Gender.MALE,
        "terry" to Gender.MALE, "терри" to Gender.MALE,
        "nevan" to Gender.MALE, "неван" to Gender.MALE,
        "madason" to Gender.MALE, "мэдэсон" to Gender.MALE,
        "corvus" to Gender.MALE, "корвус" to Gender.MALE,
        "aquila" to Gender.MALE, "аквила" to Gender.MALE,

        // Ni no Kuni: Shikkoku no Madoushi
        "oliver" to Gender.MALE, "оливер" to Gender.MALE,
        "drippy" to Gender.MALE, "дриппи" to Gender.MALE, "сидзуку" to Gender.MALE,
        "maru" to Gender.FEMALE, "esther" to Gender.FEMALE, "мару" to Gender.FEMALE, "эстер" to Gender.FEMALE,
        "allie" to Gender.FEMALE, "элли" to Gender.FEMALE,
        "pea" to Gender.FEMALE, "пиа" to Gender.FEMALE,
        "swaine" to Gender.MALE, "джаро" to Gender.MALE, "свейн" to Gender.MALE,
        "marcassin" to Gender.MALE, "маркасин" to Gender.MALE,

        // Golden Sun: Dark Dawn
        "matthew" to Gender.MALE, "мэтью" to Gender.MALE, "муто" to Gender.MALE,
        "karis" to Gender.FEMALE, "карис" to Gender.FEMALE,
        "tyrell" to Gender.MALE, "тайрелл" to Gender.MALE,
        "rief" to Gender.MALE, "риф" to Gender.MALE,
        "amiti" to Gender.MALE, "амити" to Gender.MALE,
        "sveta" to Gender.FEMALE, "света" to Gender.FEMALE,
        "eoleo" to Gender.MALE, "эолео" to Gender.MALE,
        "himi" to Gender.FEMALE, "хими" to Gender.FEMALE,
        "kraden" to Gender.MALE, "краден" to Gender.MALE,
        "chalis" to Gender.FEMALE, "чалис" to Gender.FEMALE,
        "blados" to Gender.MALE, "бладос" to Gender.MALE,

        // Hotel Dusk: Room 215 / Last Window
        "kyle" to Gender.MALE, "kyle hyde" to Gender.MALE, "кайл" to Gender.MALE, "кайл хайд" to Gender.MALE,
        "mila" to Gender.FEMALE, "mila evans" to Gender.FEMALE, "мила" to Gender.FEMALE, "мила эванс" to Gender.FEMALE,
        "rachel" to Gender.FEMALE, "рейчел" to Gender.FEMALE,
        "melissa" to Gender.FEMALE, "мелисса" to Gender.FEMALE,
        "dunning" to Gender.MALE, "даннинг" to Gender.MALE,
        "louis" to Gender.MALE, "луи" to Gender.MALE,
        "jeff" to Gender.MALE, "джефф" to Gender.MALE,
        "helen" to Gender.FEMALE, "хелен" to Gender.FEMALE,
        "summer" to Gender.MALE, "саммер" to Gender.MALE,

        // SMT: Strange Journey & Devil Survivor 1 & 2
        "jimenez" to Gender.MALE, "хименес" to Gender.MALE,
        "zelenin" to Gender.FEMALE, "зеленина" to Gender.FEMALE,
        "arthur" to Gender.MALE, "артур" to Gender.MALE,
        "louisa" to Gender.FEMALE, "луиза" to Gender.FEMALE,
        "gore" to Gender.MALE, "гор" to Gender.MALE,
        "mastema" to Gender.MALE, "мастема" to Gender.MALE,
        "atsuro" to Gender.MALE, "ацуро" to Gender.MALE,
        "yuzu" to Gender.FEMALE, "юдзу" to Gender.FEMALE,
        "haru" to Gender.FEMALE, "хару" to Gender.FEMALE,
        "midori" to Gender.FEMALE, "мидори" to Gender.FEMALE,
        "mari" to Gender.FEMALE, "мари" to Gender.FEMALE,
        "amane" to Gender.FEMALE, "амане" to Gender.FEMALE,
        "io" to Gender.FEMALE, "ио" to Gender.FEMALE,
        "daichi" to Gender.MALE, "даити" to Gender.MALE,
        "naoya" to Gender.MALE, "наоя" to Gender.MALE,
        "keisuke" to Gender.MALE, "кейсуке" to Gender.MALE,
        "kaido" to Gender.MALE, "кайдо" to Gender.MALE,
        "yamato" to Gender.MALE, "ямато" to Gender.MALE,
        "ronaldo" to Gender.MALE, "роналдо" to Gender.MALE,
        "makoto" to Gender.FEMALE, "макото" to Gender.FEMALE,
        "otome" to Gender.FEMALE, "отоме" to Gender.FEMALE,
        "fumi" to Gender.FEMALE, "фуми" to Gender.FEMALE,
        "hinako" to Gender.FEMALE, "хинако" to Gender.FEMALE,
        "airi" to Gender.FEMALE, "айри" to Gender.FEMALE,
        "jungo" to Gender.MALE, "дзюнго" to Gender.MALE,
        "joe" to Gender.MALE, "джо" to Gender.MALE,
        "alcor" to Gender.MALE, "алкор" to Gender.MALE,

        // Nintendo / Other DS Staples
        "mario" to Gender.MALE, "марио" to Gender.MALE,
        "luigi" to Gender.MALE, "луиджи" to Gender.MALE,
        "peach" to Gender.FEMALE, "princess peach" to Gender.FEMALE, "пич" to Gender.FEMALE, "принцесса пич" to Gender.FEMALE,
        "bowser" to Gender.MALE, "боузер" to Gender.MALE, "баузер" to Gender.MALE,
        "toad" to Gender.MALE, "тод" to Gender.MALE,
        "toadette" to Gender.FEMALE, "тоадетта" to Gender.FEMALE,
        "zelda" to Gender.FEMALE, "princess zelda" to Gender.FEMALE, "зельда" to Gender.FEMALE,
        "link" to Gender.MALE, "линк" to Gender.MALE,
        "linebeck" to Gender.MALE, "лайнбек" to Gender.MALE,
        "ciela" to Gender.FEMALE, "сиела" to Gender.FEMALE,
        "tetra" to Gender.FEMALE, "тетра" to Gender.FEMALE,
        "samus" to Gender.FEMALE, "samus aran" to Gender.FEMALE, "самус" to Gender.FEMALE, "самус аран" to Gender.FEMALE,
        "sonic" to Gender.MALE, "соник" to Gender.MALE,
        "tails" to Gender.MALE, "тейлз" to Gender.MALE,
        "knuckles" to Gender.MALE, "наклз" to Gender.MALE,
        "amy" to Gender.FEMALE, "amy rose" to Gender.FEMALE, "эми" to Gender.FEMALE, "эми роуз" to Gender.FEMALE,
        "shadow" to Gender.MALE, "шедоу" to Gender.MALE,
        "blaze" to Gender.FEMALE, "блейз" to Gender.FEMALE,
        "eggman" to Gender.MALE, "эггман" to Gender.MALE
    )

    /**
     * Resolves active speaker and gender from on-screen OCR blocks.
     * Checks:
     * 1. Spatial nameplate directly above a wider dialogue box.
     * 2. Inline speaker prefix ("Name: ...", "[Name] ...").
     * 3. Glossary override, persistent ROM memory, built-in dictionary, and contextual inference.
     */
    fun resolveSpeakerAndGender(
        blocks: List<TranslatedTextBlock>,
        gameKey: String,
        genderStore: CharacterGenderStore? = null,
        glossary: UserGlossaryManager? = null
    ): Pair<String, Gender> {
        if (blocks.isEmpty()) return "" to Gender.NEUTRAL

        // 1. Spatial Nameplate Detection
        val sorted = blocks.sortedWith(
            compareBy<TranslatedTextBlock> { if (it.screenIndex < 0) 0 else it.screenIndex }
                .thenBy { it.boundingBox.top }
                .thenBy { it.boundingBox.left }
        )

        for (i in 0 until sorted.size - 1) {
            val candidate = sorted[i]
            val dialogue = sorted[i + 1]
            if (isSpatialSpeakerNameplate(candidate, dialogue)) {
                val name = cleanNameplateText(candidate.originalText)
                if (name.isNotBlank()) {
                    val gender = resolveGender(name, dialogue.originalText, gameKey, genderStore, glossary)
                    return name to gender
                }
            }
        }

        // 2. Inline prefix detection on the first meaningful block
        for (block in blocks) {
            val (speaker, dialogue) = extractSpeakerAndDialogue(block.originalText)
            if (speaker.isNotBlank()) {
                val gender = resolveGender(speaker, dialogue, gameKey, genderStore, glossary)
                return speaker to gender
            }
        }

        return "" to Gender.NEUTRAL
    }

    /**
     * Extracts inline speaker name from dialogue text:
     * e.g. "Феникс: Протестую!" -> ("Феникс", "Протестую!")
     * e.g. "[Maya] Look over here!" -> ("Maya", "Look over here!")
     */
    fun extractSpeakerAndDialogue(text: String): Pair<String, String> {
        val trimmed = text.trim()
        val matcher = INLINE_SPEAKER_REGEX.matcher(trimmed)
        if (matcher.find()) {
            val candidate = (matcher.group(1) ?: matcher.group(2) ?: matcher.group(3) ?: matcher.group(4))?.trim().orEmpty()
            val dialogue = matcher.group(5)?.trim().orEmpty()
            if (candidate.isNotBlank() && candidate.length in 2..28 && !candidate.contains("\n")) {
                return candidate to dialogue
            }
        }
        return "" to trimmed
    }

    /**
     * Checks if `candidate` is a classic Nintendo DS visual novel / JRPG character nameplate
     * located directly above the top/left edge of `dialogue` box.
     */
    fun isSpatialSpeakerNameplate(candidate: TranslatedTextBlock, dialogue: TranslatedTextBlock): Boolean {
        val cBox = candidate.boundingBox
        val dBox = dialogue.boundingBox
        val cText = candidate.originalText.trim()

        if (cText.length !in 2..28) return false
        if (cText.contains("\n") || cText.endsWith(".") || cText.endsWith("!") || cText.endsWith("?")) return false

        // Dialogue box must be wider and taller than the nameplate
        if (dBox.width() < cBox.width() * 1.15f) return false
        if (dBox.height() < cBox.height() * 0.85f) return false

        // Nameplate must sit above or slightly overlapping the top of dialogue box
        val isAbove = cBox.bottom <= dBox.top + (dBox.height() * 0.35f) && cBox.top < dBox.bottom
        val isAlignedLeft = cBox.left >= dBox.left - 48f && cBox.left <= dBox.right

        return isAbove && isAlignedLeft
    }

    private fun cleanNameplateText(text: String): String {
        return text.trim()
            .removeSurrounding("【", "】")
            .removeSurrounding("[", "]")
            .removeSurrounding("«", "»")
            .removeSuffix(":")
            .removeSuffix("-")
            .removeSuffix("—")
            .trim()
    }

    /**
     * Resolves gender with strict priority:
     * 1. User Glossary override (explicitly configured)
     * 2. Per-game persistent memory (`character_gender_<gameKey>.json`)
     * 3. Built-in 300+ Nintendo DS character registry
     * 4. Contextual honorifics, pronouns & morphology
     */
    fun resolveGender(
        name: String,
        contextText: String?,
        gameKey: String,
        genderStore: CharacterGenderStore? = null,
        glossary: UserGlossaryManager? = null
    ): Gender {
        val clean = name.trim()
        val lower = clean.lowercase(Locale.ROOT)
        if (clean.isBlank()) return Gender.NEUTRAL

        // 1. Glossary Override
        if (glossary != null) {
            val glossGender = glossary.getCharacterGender(clean)
            if (glossGender != null && glossGender != Gender.NEUTRAL) {
                return glossGender
            }
        }

        // 2. ROM Persistent Memory
        if (genderStore != null) {
            val stored = genderStore.getGender(clean)
            if (stored != null && stored != Gender.NEUTRAL) {
                return stored
            }
        }

        // 3. Built-in DS Character Dictionary
        val builtin = BUILTIN_DS_CHARACTERS[lower]
        if (builtin != null) {
            genderStore?.setGender(clean, builtin)
            return builtin
        }

        // Also check first name token if full name passed (e.g., "Miles Edgeworth" -> "Miles")
        val firstName = lower.split(Regex("\\s+")).firstOrNull().orEmpty()
        val builtinFirst = BUILTIN_DS_CHARACTERS[firstName]
        if (builtinFirst != null) {
            genderStore?.setGender(clean, builtinFirst)
            return builtinFirst
        }

        // 4. Contextual Title / Honorific Cues in name or recent context
        val contextLower = (contextText.orEmpty() + " " + clean).lowercase(Locale.ROOT)
        for (cue in FEMALE_TITLE_CUES) {
            if (contextLower.contains(cue)) {
                genderStore?.setGender(clean, Gender.FEMALE)
                return Gender.FEMALE
            }
        }
        for (cue in MALE_TITLE_CUES) {
            if (contextLower.contains(cue)) {
                genderStore?.setGender(clean, Gender.MALE)
                return Gender.MALE
            }
        }

        // Third-person reference in immediately following dialogue
        if (!contextText.isNullOrBlank()) {
            val cLower = contextText.lowercase(Locale.ROOT)
            if (cLower.startsWith("she ") || cLower.startsWith("she's ") || cLower.contains(" she ") || cLower.contains(" her ")) {
                genderStore?.setGender(clean, Gender.FEMALE)
                return Gender.FEMALE
            }
            if (cLower.startsWith("he ") || cLower.startsWith("he's ") || cLower.contains(" he ") || cLower.contains(" his ") || cLower.contains(" him ")) {
                genderStore?.setGender(clean, Gender.MALE)
                return Gender.MALE
            }
        }

        // Russian / Slavic first-name and surname morphology
        val inferredMorph = inferRussianNameMorphology(clean)
        if (inferredMorph != Gender.NEUTRAL) {
            genderStore?.setGender(clean, inferredMorph)
            return inferredMorph
        }

        return Gender.NEUTRAL
    }

    private fun inferRussianNameMorphology(name: String): Gender {
        val lower = name.trim().lowercase(Locale.ROOT)

        // Female surname suffixes
        if (lower.endsWith("ова") || lower.endsWith("ева") || lower.endsWith("ина") ||
            lower.endsWith("ская") || lower.endsWith("цкая") || lower.endsWith("ая")
        ) {
            return Gender.FEMALE
        }

        // Male surname suffixes
        if (lower.endsWith("ов") || lower.endsWith("ев") || lower.endsWith("ин") ||
            lower.endsWith("ский") || lower.endsWith("цкий") || lower.endsWith("ый") || lower.endsWith("ой")
        ) {
            return Gender.MALE
        }

        // Typical female first name endings in -а / -я (excluding invariant Japanese/foreign stems like Сакура, Ая)
        if (lower.endsWith("а") || lower.endsWith("я")) {
            val maleExceptions = setOf("ваня", "петя", "миша", "саша", "даня", "дима", "илья", "юлий", "лука", "никита")
            if (lower in maleExceptions) return Gender.MALE
            return Gender.FEMALE
        }

        return Gender.NEUTRAL
    }
}
