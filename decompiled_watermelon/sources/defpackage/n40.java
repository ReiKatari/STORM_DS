package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n40  reason: default package */
/* loaded from: classes.dex */
public abstract class n40 {
    public static final byte[] a = new byte[0];
    public static final et0 b = new et0(-1520532968, false, new xk0(19));
    public static final et0 c = new et0(-525934473, false, new xk0(20));
    public static final av4 d = new av4("list-item-type");
    public static final av4 e = new av4("bullet-list-item-level");
    public static final av4 f = new av4("ordered-list-item-number");
    public static final av4 g = new av4("heading-level");
    public static final av4 h = new av4("link-destination");
    public static final av4 i = new av4("paragraph-is-in-tight-list");
    public static final av4 j = new av4("code-block-info");
    public static final float[] k = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] l = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final byte[] m = {48, 49, 53, 0};
    public static final byte[] n = {48, 49, 48, 0};
    public static final byte[] o = {48, 48, 57, 0};
    public static final byte[] p = {48, 48, 53, 0};
    public static final byte[] q = {48, 48, 49, 0};
    public static final byte[] r = {48, 48, 49, 0};
    public static final byte[] s = {48, 48, 50, 0};
    public static final int[] t = {R.attr.colorPrimary};
    public static final int[] u = {R.attr.colorPrimaryVariant};
    public static ax2 v;
    public static final /* synthetic */ int w = 0;

    public static final void A(zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(771959668);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(null)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                tj4 tj4Var = new tj4(null, k45.f0);
                sk2Var.h0(tj4Var);
                L = tj4Var;
            }
            k24 k24Var = (k24) L;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = new f4(k24Var, 3);
                sk2Var.h0(L2);
            }
            dk7.a(ko6.b.a(b0((ki2) L2, sk2Var, 0)), ct3.H0(-291176396, new w3(zy3Var, k24Var, et0Var, 2), sk2Var), sk2Var, 56);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new wl(zy3Var, et0Var, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(java.lang.String r30, java.lang.String r31, defpackage.aj2 r32, defpackage.tu0 r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.B(java.lang.String, java.lang.String, aj2, tu0, int, int):void");
    }

    public static void C(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.E, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                F(context, u, "Theme.MaterialComponents");
            }
        }
        F(context, t, "Theme.AppCompat");
    }

    public static final void D(long j2, jf4 jf4Var) {
        if (jf4Var == jf4.Vertical) {
            if (lz0.g(j2) == Integer.MAX_VALUE) {
                pz2.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (lz0.h(j2) != Integer.MAX_VALUE) {
        } else {
            pz2.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = defpackage.ay4.E
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            defpackage.i.i(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.E(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void F(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                i.i(wh1.A("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static final Object G(j11 j11Var, w92 w92Var, ki2 ki2Var, bj2 bj2Var, u92[] u92VarArr) {
        pr0 pr0Var = new pr0(null, w92Var, ki2Var, bj2Var, u92VarArr);
        fv5 fv5Var = new fv5(j11Var, j11Var.a());
        Object T = ln2.T(fv5Var, true, fv5Var, pr0Var);
        if (T == p31.COROUTINE_SUSPENDED) {
            return T;
        }
        return o27.a;
    }

    public static String H(tc0 tc0Var, Integer num) {
        if (num != null) {
            try {
                if (num.intValue() == 1) {
                    od0.a("0");
                    ce0 b2 = tc0.b(tc0Var, "0");
                    CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                    key.getClass();
                    Integer num2 = (Integer) ((ia0) b2).c(key);
                    if (num2 != null && num2.intValue() == 1) {
                        return "1";
                    }
                } else if (num.intValue() == 0) {
                    od0.a("1");
                    ce0 b3 = tc0.b(tc0Var, "1");
                    CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
                    key2.getClass();
                    Integer num3 = (Integer) ((ia0) b3).c(key2);
                    if (num3 != null && num3.intValue() == 0) {
                        return "0";
                    }
                }
                return null;
            } catch (sh1 unused) {
                if (ve2.E()) {
                    Log.e("CXCP", "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public static final void I(j62 j62Var, jk4 jk4Var) {
        try {
            IOException iOException = null;
            for (jk4 jk4Var2 : j62Var.D(jk4Var)) {
                try {
                    if (j62Var.F(jk4Var2).c) {
                        I(j62Var, jk4Var2);
                    }
                    j62Var.x(jk4Var2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException == null) {
                return;
            }
            throw iOException;
        } catch (FileNotFoundException unused) {
        }
    }

    public static boolean J() {
        Object obj;
        Method method;
        try {
            if (ee.H1 == null) {
                ee.H1 = Class.forName("android.os.SystemProperties");
            }
            Boolean bool = null;
            if (ee.I1 == null) {
                Class cls = ee.H1;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                ee.I1 = method;
            }
            Method method2 = ee.I1;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = obj;
            }
            return b53.x(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final void K(e31 e31Var, Throwable th) {
        Throwable runtimeException;
        for (h31 h31Var : i31.a) {
            try {
                h31Var.J(e31Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    pu.k(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            pu.k(th, new re1(e31Var));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final zy3 L(zy3 zy3Var, u43 u43Var) {
        return zy3Var.f(new q43(u43Var));
    }

    public static final void M(gk1 gk1Var) {
        if (((yy3) gk1Var).A.i0) {
            l.N(gk1Var, 1).f1();
        }
    }

    public static boolean N() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Huawei")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Huawei")) {
                return false;
            }
        }
        if ("HWANE".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean O() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Nokia")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Nokia")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        if (!"B2N".equalsIgnoreCase(str3) && !"B2N_sprout".equalsIgnoreCase(str3)) {
            return false;
        }
        return true;
    }

    public static boolean P() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        if ("OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean Q() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        if ("OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    public static boolean R() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Redmi")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Redmi")) {
                return false;
            }
        }
        if ("joyeuse".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0.equalsIgnoreCase("Samsung") != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean S() {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3b
        L19:
            java.lang.String r0 = "a05s"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3b
            java.lang.String r0 = android.os.Build.MODEL
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r0.getClass()
            java.lang.String r1 = "SM-A057"
            boolean r0 = defpackage.zg6.q0(r0, r1, r2)
            if (r0 == 0) goto L3b
            r0 = 1
            return r0
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.S():boolean");
    }

    public static boolean T() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        if ("J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean U() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        if ("ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean V() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        if (!"q4q".equalsIgnoreCase(str3) && !"SCG16".equalsIgnoreCase(str3) && !"SC-55C".equalsIgnoreCase(str3)) {
            return false;
        }
        return true;
    }

    public static String W(hu2 hu2Var) {
        hu2Var.getClass();
        w70 w70Var = w70.R;
        return iq0.p(hu2Var.i).c("MD5").e();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long X(int r32, int r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.X(int, int, java.lang.String):long");
    }

    public static TypedArray Y(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        C(context, attributeSet, i2, i3);
        E(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static final zy3 Z(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new sb4(mi2Var));
    }

    public static final void a(zy3 zy3Var, pp5 pp5Var, aj2 aj2Var, mi2 mi2Var, aj2 aj2Var2, ki2 ki2Var, ki2 ki2Var2, mi2 mi2Var2, tu0 tu0Var, int i2) {
        int i3;
        aj2 aj2Var3;
        mi2 mi2Var3;
        aj2 aj2Var4;
        mi2 mi2Var4;
        boolean z;
        sk2 sk2Var;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zy3Var.getClass();
        pp5Var.getClass();
        aj2Var.getClass();
        mi2Var.getClass();
        aj2Var2.getClass();
        ki2Var.getClass();
        ki2Var2.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(2093948359);
        if ((i2 & 6) == 0) {
            if (sk2Var2.f(zy3Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var2.f(pp5Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            aj2Var3 = aj2Var;
            if (sk2Var2.h(aj2Var3)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            aj2Var3 = aj2Var;
        }
        if ((i2 & 3072) == 0) {
            mi2Var3 = mi2Var;
            if (sk2Var2.h(mi2Var3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        } else {
            mi2Var3 = mi2Var;
        }
        if ((i2 & 24576) == 0) {
            aj2Var4 = aj2Var2;
            if (sk2Var2.h(aj2Var4)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        } else {
            aj2Var4 = aj2Var2;
        }
        if ((196608 & i2) == 0) {
            if (sk2Var2.h(ki2Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((12582912 & i2) == 0) {
            mi2Var4 = mi2Var2;
            if (sk2Var2.h(mi2Var4)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        } else {
            mi2Var4 = mi2Var2;
        }
        if ((4269203 & i3) != 4269202) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i3 & 1, z)) {
            Object L = sk2Var2.L();
            if (L == su0.a) {
                L = l.A(sk2Var2);
                sk2Var2.h0(L);
            }
            o31 o31Var = (o31) L;
            pk3 a2 = qk3.a(sk2Var2);
            zy3 f2 = zy3Var.f(o76.c);
            lr0 a3 = jr0.a(rt.d, y60.k0, sk2Var2, 54);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, f2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            oo2.S(sk2Var2, mu0.f, a3);
            oo2.S(sk2Var2, mu0.e, l2);
            oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var2, mu0.h);
            oo2.S(sk2Var2, mu0.d, e0);
            if (pp5Var.equals(lp5.a)) {
                sk2Var2.X(-2144371299);
                z2 = true;
                yu4.a(null, ((hr0) sk2Var2.j(ir0.a)).i(), RecyclerView.A1, 0L, 0, sk2Var2, 0, 29);
                sk2Var = sk2Var2;
                sk2Var.p(false);
            } else {
                sk2Var = sk2Var2;
                z2 = true;
                boolean z3 = pp5Var instanceof op5;
                wy3 wy3Var = wy3.a;
                if (z3) {
                    sk2Var.X(-2144156810);
                    d50.a(ct3.f0(wy3Var, false, null, 3), sk2Var, 6);
                    zy3 f3 = o76.l(760.0f, 1, wy3Var).f(new xg3(1.0f, true));
                    op5 op5Var = (op5) pp5Var;
                    aj2 aj2Var5 = aj2Var3;
                    k(f3, op5Var.a, op5Var.b, aj2Var5, mi2Var3, aj2Var4, a2, mi2Var4, sk2Var, ((i3 << 3) & 523264) | (i3 & 29360128));
                    sk2Var = sk2Var;
                    sk2Var.p(false);
                } else if (!pp5Var.equals(kp5.a) && !(pp5Var instanceof mp5) && !pp5Var.equals(np5.a)) {
                    throw ej6.d(sk2Var, 762110097, false);
                } else {
                    sk2Var.X(-2143013964);
                    v(b53.X(o76.l(640.0f, 1, wy3Var), 32.0f), ki2Var, sk2Var, ((i3 >> 12) & 112) | 6);
                    sk2Var.p(false);
                }
            }
            sk2Var.p(z2);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new w4(zy3Var, pp5Var, aj2Var, mi2Var, aj2Var2, ki2Var, ki2Var2, mi2Var2, i2);
        }
    }

    public static zy3 a0(float f2) {
        return new nb4(f2);
    }

    public static final void b(ct1 ct1Var, ki2 ki2Var, mi2 mi2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        ki2 ki2Var2;
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-597835300);
        if (sk2Var.h(ct1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (sk2Var.h(ki2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (sk2Var.h(mi2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            ki2Var2 = ki2Var;
            dt3.t(ki2Var2, new ff1(3), ct3.H0(10994917, new a4(ct1Var, ki2Var, mi2Var), sk2Var), sk2Var, ((i8 >> 3) & 14) | 432, 0);
        } else {
            ki2Var2 = ki2Var;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new a4(ct1Var, ki2Var2, mi2Var, i2);
        }
    }

    public static final vl b0(ki2 ki2Var, tu0 tu0Var, int i2) {
        sk2 sk2Var = (sk2) tu0Var;
        View view = (View) sk2Var.j(ue.f);
        boolean f2 = sk2Var.f(view);
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (f2 || L == sn1Var) {
            L = new vl(view, null, ki2Var);
            sk2Var.h0(L);
        }
        vl vlVar = (vl) L;
        boolean h2 = sk2Var.h(vlVar);
        Object L2 = sk2Var.L();
        if (h2 || L2 == sn1Var) {
            L2 = new ql(vlVar, 3);
            sk2Var.h0(L2);
        }
        l.d(vlVar, (mi2) L2, sk2Var);
        return vlVar;
    }

    public static final void c(sg5 sg5Var, k6 k6Var, List list, mi2 mi2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        List list2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-213808454);
        if (sk2Var.f(sg5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (sk2Var.d(k6Var.ordinal())) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (sk2Var.h(list)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i10 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            lr0 a2 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            wy3 wy3Var = wy3.a;
            zy3 e0 = l07.e0(sk2Var, wy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            i20 i20Var = y60.h0;
            zy3 a0 = b53.a0(o76.c(wy3Var, 1.0f), 12.0f, 7.0f, 16.0f, 7.0f);
            lt ltVar = rt.a;
            sr5 a3 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, a0);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            sr5 a4 = rr5.a(ltVar, y60.i0, sk2Var, 48);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, wy3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a4);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            ir6.b(me2.X(sk2Var, R.string.achievements), null, C.g, hi2.B(14), pe2.c0, td7.a, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 1772544, 0, 130962);
            cg2.k(sk2Var, o76.k(wy3Var, 8.0f));
            int i11 = sg5Var.c;
            int i12 = sg5Var.b;
            int i13 = sg5Var.d;
            String X = me2.X(sk2Var, R.string.points_abbreviated);
            StringBuilder sb = new StringBuilder();
            sb.append(i11);
            sb.append("/");
            sb.append(i12);
            sb.append(" · ");
            sb.append(i13);
            ir6.b(b31.q(sb, " ", X), b53.b0(wy3Var, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 1.0f, 7), C.i, hi2.A(9.5d), null, td7.c, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 1575984, 0, 130992);
            sk2Var.p(true);
            cg2.k(sk2Var, new xg3(1.0f, true));
            list2 = list;
            i(tq0.g1(list2, new hd2(5)), k6Var, mi2Var, new ot0(5), o76.l(360.0f, 1, wy3Var), sk2Var, (i10 & 112) | 24576 | ((i10 >> 3) & 896));
            sk2Var = sk2Var;
            sk2Var.p(true);
            tq5.a(null, C.f, RecyclerView.A1, sk2Var, 0, 13);
            sk2Var.p(true);
        } else {
            list2 = list;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new p4(sg5Var, k6Var, list2, mi2Var, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r6 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        defpackage.iq2.g(16);
        r0 = java.lang.Integer.toString(r10, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c0(defpackage.s45 r12) {
        /*
            java.lang.String r0 = "expected an int but was \""
            f60 r1 = r12.B     // Catch: java.lang.NumberFormatException -> L80
            r2 = 1
            r12.b0(r2)     // Catch: java.lang.NumberFormatException -> L80
            r4 = 0
            r6 = r4
        Lc:
            long r8 = r6 + r2
            boolean r10 = r12.u(r8)     // Catch: java.lang.NumberFormatException -> L80
            if (r10 == 0) goto L46
            byte r10 = r1.D(r6)     // Catch: java.lang.NumberFormatException -> L80
            r11 = 48
            if (r10 < r11) goto L20
            r11 = 57
            if (r10 <= r11) goto L29
        L20:
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L2b
            r7 = 45
            if (r10 == r7) goto L29
            goto L2b
        L29:
            r6 = r8
            goto Lc
        L2b:
            if (r6 == 0) goto L2e
            goto L46
        L2e:
            java.lang.NumberFormatException r12 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L80
            r0 = 16
            defpackage.iq2.g(r0)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r0 = java.lang.Integer.toString(r10, r0)     // Catch: java.lang.NumberFormatException -> L80
            r0.getClass()     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.NumberFormatException -> L80
            r12.<init>(r0)     // Catch: java.lang.NumberFormatException -> L80
            throw r12     // Catch: java.lang.NumberFormatException -> L80
        L46:
            long r1 = r1.N()     // Catch: java.lang.NumberFormatException -> L80
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r12 = r12.O(r6)     // Catch: java.lang.NumberFormatException -> L80
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L66
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L66
            int r3 = r12.length()     // Catch: java.lang.NumberFormatException -> L80
            if (r3 > 0) goto L66
            int r12 = (int) r1     // Catch: java.lang.NumberFormatException -> L80
            return r12
        L66:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.NumberFormatException -> L80
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L80
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> L80
            r4.append(r1)     // Catch: java.lang.NumberFormatException -> L80
            r4.append(r12)     // Catch: java.lang.NumberFormatException -> L80
            r12 = 34
            r4.append(r12)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r12 = r4.toString()     // Catch: java.lang.NumberFormatException -> L80
            r3.<init>(r12)     // Catch: java.lang.NumberFormatException -> L80
            throw r3     // Catch: java.lang.NumberFormatException -> L80
        L80:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            defpackage.f81.j(r12)
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.c0(s45):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.vv r23, final java.lang.String r24, final defpackage.zy3 r25, final defpackage.mi2 r26, final defpackage.mi2 r27, final defpackage.ub r28, final defpackage.s01 r29, final float r30, final int r31, defpackage.tu0 r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.d(vv, java.lang.String, zy3, mi2, mi2, ub, s01, float, int, tu0, int, int):void");
    }

    public static zy3 d0(zy3 zy3Var, boolean z, og5 og5Var, ki2 ki2Var, int i2) {
        if ((i2 & 4) != 0) {
            og5Var = null;
        }
        return zy3Var.f(new ly5(z, null, null, true, true, og5Var, ki2Var));
    }

    public static final void e(String str, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-1418047088);
        if (sk2Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i4 & 1, z)) {
            jd7 C = mj2.C(sk2Var2);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sk2Var = sk2Var2;
            ir6.b(upperCase, b53.b0(o76.c(wy3.a, 1.0f), 2.0f, 15.0f, RecyclerView.A1, 8.0f, 4), C.i, hi2.A(9.5d), pe2.c0, td7.c, hi2.A(0.8d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 14355504, 0, 130832);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new h5(str, i2, 0);
        }
    }

    public static Set e0(xq2 xq2Var) {
        int size = xq2Var.size();
        TreeSet treeSet = null;
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(xq2Var.c(i2))) {
                String i3 = xq2Var.i(i2);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                for (String str : zg6.P0(i3, new char[]{','}, 6)) {
                    treeSet.add(zg6.Z0(str).toString());
                }
            }
        }
        if (treeSet == null) {
            return up1.A;
        }
        return treeSet;
    }

    public static q60 f(int i2, h60 h60Var, mi2 mi2Var, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            h60Var = h60.SUSPEND;
        }
        if ((i3 & 4) != 0) {
            mi2Var = null;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != Integer.MAX_VALUE) {
                        if (h60Var == h60.SUSPEND) {
                            return new q60(i2, mi2Var);
                        }
                        return new kw0(i2, h60Var, mi2Var);
                    }
                    return new q60(Preference.DEFAULT_ORDER, mi2Var);
                } else if (h60Var == h60.SUSPEND) {
                    return new q60(0, mi2Var);
                } else {
                    return new kw0(1, h60Var, mi2Var);
                }
            } else if (h60Var == h60.SUSPEND) {
                return new kw0(1, h60.DROP_OLDEST, mi2Var);
            } else {
                i.i("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                return null;
            }
        } else if (h60Var == h60.SUSPEND) {
            lj0.h.getClass();
            return new q60(kj0.b, mi2Var);
        } else {
            return new kw0(1, h60Var, mi2Var);
        }
    }

    public static final zy3 f0(zy3 zy3Var, u43 u43Var) {
        return zy3Var.f(new w43(u43Var));
    }

    public static final void g(String str, ki2 ki2Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        str.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-97185720);
        if (sk2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if ((i2 & 48) == 0) {
            if (sk2Var.h(ki2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i5 & 1, z)) {
            dt3.t(ki2Var, null, ct3.H0(865092945, new w3(mj2.C(sk2Var), str, et0Var, 8), sk2Var), sk2Var, ((i5 >> 3) & 14) | RendererDebugBridge.CAPTURE_HEIGHT, 2);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new fl(str, ki2Var, et0Var, i2, 4);
        }
    }

    public static final int g0(float f2, float[] fArr, int i2) {
        float f3 = RecyclerView.A1;
        if (f2 >= RecyclerView.A1) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.String r30, boolean r31, boolean r32, defpackage.ki2 r33, defpackage.tu0 r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.h(java.lang.String, boolean, boolean, ki2, tu0, int, int):void");
    }

    public static final void i(final List list, final Object obj, final mi2 mi2Var, final bj2 bj2Var, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        sk2 sk2Var;
        boolean z2;
        boolean z3;
        final int i6;
        int i7;
        int i8;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-926502816);
        if (sk2Var2.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i3 | i2;
        if (sk2Var2.f(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var2.h(mi2Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i10 |= i8;
        }
        if (sk2Var2.h(bj2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if ((i2 & 24576) == 0) {
            if (sk2Var2.f(zy3Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i11 |= i7;
        }
        boolean z4 = false;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i11 & 1, z)) {
            final jd7 C = mj2.C(sk2Var2);
            ot otVar = new ot(5.0f, true, new i(1));
            boolean h2 = sk2Var2.h(list);
            if ((i11 & 112) != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z5 = z2 | h2;
            if ((i11 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = z5 | z3 | sk2Var2.f(C);
            if ((i11 & 896) == 256) {
                z4 = true;
            }
            boolean z6 = f2 | z4;
            Object L = sk2Var2.L();
            if (z6 || L == su0.a) {
                i6 = i11;
                mi2 mi2Var2 = new mi2() { // from class: q4
                    @Override // defpackage.mi2
                    public final Object n(Object obj2) {
                        ek3 ek3Var = (ek3) obj2;
                        ek3Var.getClass();
                        List list2 = list;
                        ek3Var.b0(list2.size(), null, new k5(0, list2), new et0(802480018, true, new l5(list2, obj, bj2Var, i6, C, mi2Var)));
                        return o27.a;
                    }
                };
                sk2Var2.h0(mi2Var2);
                L = mi2Var2;
            } else {
                i6 = i11;
            }
            sk2Var = sk2Var2;
            io2.c(zy3Var, null, null, otVar, null, null, false, null, (mi2) L, sk2Var, ((i6 >> 12) & 14) | 24576, 494);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new r4(list, obj, mi2Var, bj2Var, zy3Var, i2, 0);
        }
    }

    public static final void j(final zy3 zy3Var, final tv tvVar, final String str, final ub ubVar, final s01 s01Var, final float f2, tu0 tu0Var, final int i2) {
        int i3;
        zy3 zy3Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(777774312);
        if ((i2 & 14) == 0) {
            if (sk2Var.f(zy3Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (sk2Var.f(tvVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & 896) == 0) {
            if (sk2Var.f(str)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i2 & 7168) == 0) {
            if (sk2Var.f(ubVar)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((57344 & i2) == 0) {
            if (sk2Var.f(s01Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((458752 & i2) == 0) {
            if (sk2Var.c(f2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((3670016 & i2) == 0) {
            if (sk2Var.f(null)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((29360128 & i2) == 0) {
            if (sk2Var.g(true)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        if ((i3 & 23967451) == 4793490 && sk2Var.A()) {
            sk2Var.R();
        } else {
            i55 i55Var = g67.b;
            if (str != null) {
                zy3Var2 = fz5.a(zy3Var, false, new ok0(str, 13));
            } else {
                zy3Var2 = zy3Var;
            }
            zy3 f3 = a53.u(zy3Var2).f(new p01(tvVar, ubVar, s01Var, f2));
            wf wfVar = wf.e;
            sk2Var.Y(544976794);
            int j0 = dt3.j0(sk2Var);
            zy3 e0 = l07.e0(sk2Var, f3);
            sm4 l2 = sk2Var.l();
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.Y(1405779621);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(new dj(3, mv0Var));
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, wfVar);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.d, e0);
            dn dnVar = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar);
            }
            sk2Var.p(true);
            sk2Var.p(false);
            sk2Var.p(false);
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2() { // from class: kv
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n40.j(zy3.this, tvVar, str, ubVar, s01Var, f2, (tu0) obj, ep2.I(i2 | 1));
                    return o27.a;
                }
            };
        }
    }

    public static final void k(final zy3 zy3Var, final List list, final Set set, final aj2 aj2Var, final mi2 mi2Var, final aj2 aj2Var2, final pk3 pk3Var, final mi2 mi2Var2, tu0 tu0Var, final int i2) {
        int i3;
        Set set2;
        aj2 aj2Var3;
        pk3 pk3Var2;
        mi2 mi2Var3;
        boolean z;
        sk2 sk2Var;
        Object obj;
        f6 f6Var;
        Object A0;
        final boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-124944075);
        if ((i2 & 6) == 0) {
            if (sk2Var2.f(zy3Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var2.h(list)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            set2 = set;
            if (sk2Var2.h(set2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            set2 = set;
        }
        if ((i2 & 3072) == 0) {
            aj2Var3 = aj2Var;
            if (sk2Var2.h(aj2Var3)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        } else {
            aj2Var3 = aj2Var;
        }
        if ((i2 & 24576) == 0) {
            if (sk2Var2.h(mi2Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (sk2Var2.h(aj2Var2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i2) == 0) {
            pk3Var2 = pk3Var;
            if (sk2Var2.f(pk3Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        } else {
            pk3Var2 = pk3Var;
        }
        if ((12582912 & i2) == 0) {
            mi2Var3 = mi2Var2;
            if (sk2Var2.h(mi2Var3)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        } else {
            mi2Var3 = mi2Var2;
        }
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i3 & 1, z)) {
            if (list.isEmpty()) {
                sk2Var2.X(1528149555);
                p(zy3Var, sk2Var2, i3 & 14);
                sk2Var2.p(false);
                m55 r2 = sk2Var2.r();
                if (r2 != null) {
                    final Set set3 = set2;
                    final aj2 aj2Var4 = aj2Var3;
                    final pk3 pk3Var3 = pk3Var2;
                    final mi2 mi2Var4 = mi2Var3;
                    r2.d = new aj2() { // from class: z4
                        @Override // defpackage.aj2
                        public final Object j(Object obj2, Object obj3) {
                            int i12 = r10;
                            o27 o27Var = o27.a;
                            int i13 = i2;
                            switch (i12) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int I = ep2.I(i13 | 1);
                                    n40.k(zy3Var, list, set3, aj2Var4, mi2Var, aj2Var2, pk3Var3, mi2Var4, (tu0) obj2, I);
                                    return o27Var;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int I2 = ep2.I(i13 | 1);
                                    n40.k(zy3Var, list, set3, aj2Var4, mi2Var, aj2Var2, pk3Var3, mi2Var4, (tu0) obj2, I2);
                                    return o27Var;
                                default:
                                    ((Integer) obj3).getClass();
                                    int I3 = ep2.I(i13 | 1);
                                    n40.k(zy3Var, list, set3, aj2Var4, mi2Var, aj2Var2, pk3Var3, mi2Var4, (tu0) obj2, I3);
                                    return o27Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            sk2Var2.X(1528205293);
            sk2Var2.p(false);
            Object L = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(null);
                sk2Var2.h0(L);
            }
            final k24 k24Var = (k24) L;
            j15 j15Var = (j15) k24Var.getValue();
            if (j15Var == null) {
                sk2Var2.X(1528353379);
                sk2Var2.p(false);
                Object[] objArr = new Object[0];
                boolean h2 = sk2Var2.h(list);
                Object L2 = sk2Var2.L();
                if (h2 || L2 == sn1Var) {
                    L2 = new c5(0, list);
                    sk2Var2.h0(L2);
                }
                final rj4 rj4Var = (rj4) jk2.M(objArr, (ki2) L2, sk2Var2, 0);
                Object[] objArr2 = new Object[0];
                Object L3 = sk2Var2.L();
                if (L3 == sn1Var) {
                    L3 = new d5(0);
                    sk2Var2.h0(L3);
                }
                final k24 k24Var2 = (k24) jk2.M(objArr2, (ki2) L3, sk2Var2, 48);
                Object[] objArr3 = new Object[0];
                Object L4 = sk2Var2.L();
                if (L4 == sn1Var) {
                    L4 = new d5(1);
                    sk2Var2.h0(L4);
                }
                final k24 k24Var3 = (k24) jk2.M(objArr3, (ki2) L4, sk2Var2, 48);
                Object[] objArr4 = new Object[0];
                Object L5 = sk2Var2.L();
                if (L5 == sn1Var) {
                    L5 = new d5(2);
                    sk2Var2.h0(L5);
                }
                final k24 k24Var4 = (k24) jk2.M(objArr4, (ki2) L5, sk2Var2, 48);
                boolean h3 = sk2Var2.h(list) | sk2Var2.f(rj4Var);
                Object L6 = sk2Var2.L();
                if (h3 || L6 == sn1Var) {
                    L6 = new n5(list, rj4Var, (j11) null, 0);
                    sk2Var2.h0(L6);
                }
                l.g(sk2Var2, (aj2) L6, list);
                boolean e2 = sk2Var2.e(rj4Var.h()) | sk2Var2.f(list);
                Object L7 = sk2Var2.L();
                if (e2 || L7 == sn1Var) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((c6) obj).a == rj4Var.h()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    L7 = (c6) obj;
                    if (L7 == null) {
                        L7 = (c6) tq0.K0(list);
                    }
                    sk2Var2.h0(L7);
                }
                final c6 c6Var = (c6) L7;
                boolean f2 = sk2Var2.f(c6Var);
                Object L8 = sk2Var2.L();
                if (f2 || L8 == sn1Var) {
                    ip3 C = l07.C();
                    C.add(f6.All);
                    List<f3> list2 = c6Var.f;
                    ArrayList arrayList = new ArrayList(uq0.y0(list2, 10));
                    for (f3 f3Var : list2) {
                        e6 e6Var = f6.Companion;
                        e3 e3Var = f3Var.a;
                        e6Var.getClass();
                        e3Var.getClass();
                        switch (d6.a[e3Var.ordinal()]) {
                            case 1:
                                f6Var = f6.PendingSubmissions;
                                break;
                            case 2:
                                f6Var = f6.ActiveChallenges;
                                break;
                            case 3:
                                f6Var = f6.RecentlyUnlocked;
                                break;
                            case 4:
                                f6Var = f6.Unsynced;
                                break;
                            case 5:
                                f6Var = f6.AlmostThere;
                                break;
                            case ig7.b /* 6 */:
                                f6Var = f6.Locked;
                                break;
                            case 7:
                                f6Var = f6.Unsupported;
                                break;
                            case 8:
                                f6Var = f6.Unofficial;
                                break;
                            case 9:
                                f6Var = f6.Unlocked;
                                break;
                            default:
                                i.c();
                                f6Var = null;
                                break;
                        }
                        arrayList.add(f6Var);
                    }
                    C.addAll(tq0.g1(tq0.n1(tq0.r1(arrayList)), new hd2(6)));
                    L8 = l07.t(C);
                    sk2Var2.h0(L8);
                }
                final List list3 = (List) L8;
                boolean f3 = sk2Var2.f(c6Var);
                Object L9 = sk2Var2.L();
                if (f3 || L9 == sn1Var) {
                    ip3 C2 = l07.C();
                    C2.add(k6.All);
                    C2.add(k6.Core);
                    if (!c6Var.g.isEmpty()) {
                        C2.add(k6.Leaderboards);
                    }
                    C2.add(k6.Unofficial);
                    L9 = l07.t(C2);
                    sk2Var2.h0(L9);
                }
                final List list4 = (List) L9;
                boolean h4 = sk2Var2.h(list4) | sk2Var2.f(k24Var2);
                Object L10 = sk2Var2.L();
                if (h4 || L10 == sn1Var) {
                    L10 = new o5(list4, k24Var2, null, 0);
                    sk2Var2.h0(L10);
                }
                l.g(sk2Var2, (aj2) L10, list4);
                boolean h5 = sk2Var2.h(list3) | sk2Var2.f(k24Var3);
                Object L11 = sk2Var2.L();
                if (h5 || L11 == sn1Var) {
                    L11 = new o5(list3, k24Var3, null, 1);
                    sk2Var2.h0(L11);
                }
                l.g(sk2Var2, (aj2) L11, list3);
                boolean f4 = sk2Var2.f(c6Var) | sk2Var2.d(((k6) k24Var2.getValue()).ordinal()) | sk2Var2.d(((f6) k24Var3.getValue()).ordinal()) | sk2Var2.g(((Boolean) k24Var4.getValue()).booleanValue());
                Object L12 = sk2Var2.L();
                if (f4 || L12 == sn1Var) {
                    if (((k6) k24Var2.getValue()) == k6.Leaderboards) {
                        A0 = pp1.A;
                    } else {
                        A0 = d06.A0(new w72(new y82(new w72(tq0.E0(c6Var.f), true, new j4(k24Var3, 2)), new x(1, k24Var2, k24Var4), 2), true, new k4(4)));
                    }
                    L12 = A0;
                    sk2Var2.h0(L12);
                }
                final List list5 = (List) L12;
                if (!c6Var.g.isEmpty() && (((k6) k24Var2.getValue()) == k6.Leaderboards || (((k6) k24Var2.getValue()) == k6.All && c6Var.f.isEmpty()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                final long a2 = ((hr0) sk2Var2.j(ir0.a)).a();
                od1 od1Var = (od1) sk2Var2.j(ov0.h);
                final sd3 sd3Var = (sd3) sk2Var2.j(ov0.n);
                Object L13 = sk2Var2.L();
                if (L13 == sn1Var) {
                    L13 = l.A(sk2Var2);
                    sk2Var2.h0(L13);
                }
                final o31 o31Var = (o31) L13;
                boolean f5 = sk2Var2.f(od1Var);
                Object L14 = sk2Var2.L();
                if (f5 || L14 == sn1Var) {
                    float C3 = od1Var.C(40.0f);
                    z3 z3Var = new z3(C3, C3);
                    sk2Var2.h0(z3Var);
                    L14 = z3Var;
                }
                z3 z3Var2 = (z3) L14;
                boolean f6 = sk2Var2.f(od1Var);
                Object L15 = sk2Var2.L();
                if (f6 || L15 == sn1Var) {
                    L15 = Float.valueOf(od1Var.C(80.0f));
                    sk2Var2.h0(L15);
                }
                final float floatValue = ((Number) L15).floatValue();
                final sg5 sg5Var = c6Var.e;
                dk7.a(x50.a.a(z3Var2), ct3.H0(-1098754955, new aj2() { // from class: y4
                    @Override // defpackage.aj2
                    public final Object j(Object obj2, Object obj3) {
                        boolean z3;
                        tu0 tu0Var2 = (tu0) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if ((intValue & 3) != 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sk2 sk2Var3 = (sk2) tu0Var2;
                        if (sk2Var3.O(intValue & 1, z3)) {
                            zy3 f7 = zy3.this.f(o76.c);
                            lr0 a3 = jr0.a(rt.c, y60.j0, sk2Var3, 0);
                            int hashCode = Long.hashCode(sk2Var3.T);
                            sm4 l2 = sk2Var3.l();
                            zy3 e0 = l07.e0(sk2Var3, f7);
                            nu0.i.getClass();
                            ki2 ki2Var = mu0.b;
                            sk2Var3.b0();
                            if (sk2Var3.S) {
                                sk2Var3.k(ki2Var);
                            } else {
                                sk2Var3.k0();
                            }
                            oo2.S(sk2Var3, mu0.f, a3);
                            oo2.S(sk2Var3, mu0.e, l2);
                            oo2.S(sk2Var3, mu0.g, Integer.valueOf(hashCode));
                            oo2.P(sk2Var3, mu0.h);
                            oo2.S(sk2Var3, mu0.d, e0);
                            final k24 k24Var5 = k24Var2;
                            k6 k6Var = (k6) k24Var5.getValue();
                            boolean f8 = sk2Var3.f(k24Var5);
                            Object L16 = sk2Var3.L();
                            Object obj4 = su0.a;
                            if (f8 || L16 == obj4) {
                                L16 = new j4(k24Var5, 0);
                                sk2Var3.h0(L16);
                            }
                            n40.c(sg5Var, k6Var, list4, (mi2) L16, sk2Var3, 0);
                            zy3 f9 = o76.c(wy3.a, 1.0f).f(new xg3(1.0f, true));
                            pk3 pk3Var4 = pk3Var;
                            boolean f10 = sk2Var3.f(pk3Var4);
                            o31 o31Var2 = o31Var;
                            boolean h6 = f10 | sk2Var3.h(o31Var2);
                            float f11 = floatValue;
                            boolean c2 = h6 | sk2Var3.c(f11);
                            Object L17 = sk2Var3.L();
                            if (c2 || L17 == obj4) {
                                L17 = new o4(pk3Var4, o31Var2, f11, 1);
                                sk2Var3.h0(L17);
                            }
                            zy3 C4 = a53.C(f9, (mi2) L17);
                            sd3 sd3Var2 = sd3Var;
                            boolean d2 = sk2Var3.d(sd3Var2.ordinal());
                            final List list6 = list;
                            boolean h7 = d2 | sk2Var3.h(list6);
                            final rj4 rj4Var2 = rj4Var;
                            boolean f12 = h7 | sk2Var3.f(rj4Var2);
                            Object L18 = sk2Var3.L();
                            if (f12 || L18 == obj4) {
                                L18 = new q5(list6, sd3Var2, rj4Var2);
                                sk2Var3.h0(L18);
                            }
                            zy3 A = w81.A(C4, (mi2) L18);
                            long j2 = a2;
                            boolean e3 = sk2Var3.e(j2);
                            Object L19 = sk2Var3.L();
                            if (e3 || L19 == obj4) {
                                L19 = new u4(0, j2);
                                sk2Var3.h0(L19);
                            }
                            zy3 F = l07.F(A, (mi2) L19);
                            h20 h20Var = y60.k0;
                            mh4 mh4Var = new mh4(16.0f, 2.0f, 16.0f, 40.0f);
                            boolean h8 = sk2Var3.h(list6) | sk2Var3.f(rj4Var2) | sk2Var3.f(k24Var5);
                            final List list7 = list3;
                            boolean h9 = h8 | sk2Var3.h(list7);
                            final k24 k24Var6 = k24Var3;
                            boolean f13 = h9 | sk2Var3.f(k24Var6);
                            final k24 k24Var7 = k24Var4;
                            final List list8 = list5;
                            boolean f14 = f13 | sk2Var3.f(k24Var7) | sk2Var3.h(list8);
                            final boolean z4 = z2;
                            final Set set4 = set;
                            final aj2 aj2Var5 = aj2Var;
                            final mi2 mi2Var5 = mi2Var2;
                            final c6 c6Var2 = c6Var;
                            boolean g2 = f14 | sk2Var3.g(z4) | sk2Var3.h(set4) | sk2Var3.f(aj2Var5) | sk2Var3.f(mi2Var5) | sk2Var3.h(c6Var2);
                            Object L20 = sk2Var3.L();
                            if (g2 || L20 == obj4) {
                                final k24 k24Var8 = k24Var;
                                Object obj5 = new mi2() { // from class: a5
                                    @Override // defpackage.mi2
                                    public final Object n(Object obj6) {
                                        ek3 ek3Var = (ek3) obj6;
                                        ek3Var.getClass();
                                        List list9 = list6;
                                        if (list9.size() > 1) {
                                            ek3.a0(ek3Var, null, null, new et0(777685903, true, new l4(0, list9, rj4Var2)), 3);
                                        }
                                        if (((k6) k24Var5.getValue()) != k6.Leaderboards) {
                                            ek3.a0(ek3Var, null, "filters", new et0(-540957320, true, new m4(list7, k24Var6, k24Var7, 0)), 1);
                                        }
                                        List<f3> list10 = list8;
                                        boolean isEmpty = list10.isEmpty();
                                        boolean z5 = z4;
                                        if (isEmpty && !z5) {
                                            ek3.a0(ek3Var, null, "achievement", ct3.B, 1);
                                        }
                                        for (f3 f3Var2 : list10) {
                                            ek3.a0(ek3Var, null, "bucket-header", new et0(-56377967, true, new km4(1, f3Var2)), 1);
                                            List list11 = f3Var2.b;
                                            ek3Var.b0(list11.size(), null, new s5(2, new k4(1), list11), new et0(802480018, true, new t5(list11, set4, aj2Var5, mi2Var5, 0)));
                                        }
                                        if (z5) {
                                            ek3.a0(ek3Var, null, "leaderboard-header", ct3.L, 1);
                                            List list12 = c6Var2.g;
                                            ek3Var.b0(list12.size(), new s5(0, new k4(2), list12), new s5(1, new k4(3), list12), new et0(802480018, true, new lz1(list12, k24Var8, 3)));
                                        }
                                        return o27.a;
                                    }
                                };
                                sk2Var3.h0(obj5);
                                L20 = obj5;
                            }
                            io2.b(F, pk3Var4, mh4Var, null, h20Var, null, false, null, (mi2) L20, sk2Var3, 196608, 472);
                            sk2Var3.p(true);
                        } else {
                            sk2Var3.R();
                        }
                        return o27.a;
                    }
                }, sk2Var2), sk2Var2, 56);
                sk2Var = sk2Var2;
            } else {
                long j2 = j15Var.a;
                sk2Var2.X(1528353380);
                boolean e3 = sk2Var2.e(j2);
                Object L16 = sk2Var2.L();
                if (e3 || L16 == sn1Var) {
                    L16 = new rj4(0L);
                    sk2Var2.h0(L16);
                }
                rj4 rj4Var2 = (rj4) L16;
                boolean e4 = sk2Var2.e(j2);
                Object L17 = sk2Var2.L();
                if (e4 || L17 == sn1Var) {
                    L17 = me2.G(ol3.b);
                    sk2Var2.h0(L17);
                }
                k24 k24Var5 = (k24) L17;
                Long valueOf = Long.valueOf(j2);
                Long valueOf2 = Long.valueOf(rj4Var2.h());
                boolean f7 = sk2Var2.f(k24Var5) | sk2Var2.h(aj2Var2) | sk2Var2.h(j15Var);
                Object L18 = sk2Var2.L();
                if (f7 || L18 == sn1Var) {
                    L18 = new m5(aj2Var2, j15Var, k24Var5, (j11) null);
                    sk2Var2.h0(L18);
                }
                l.h(valueOf, valueOf2, (aj2) L18, sk2Var2);
                ql3 ql3Var = (ql3) k24Var5.getValue();
                Object L19 = sk2Var2.L();
                if (L19 == sn1Var) {
                    L19 = new f4(k24Var, 2);
                    sk2Var2.h0(L19);
                }
                ki2 ki2Var = (ki2) L19;
                boolean f8 = sk2Var2.f(rj4Var2);
                Object L20 = sk2Var2.L();
                if (f8 || L20 == sn1Var) {
                    L20 = new b5(0, rj4Var2);
                    sk2Var2.h0(L20);
                }
                r(zy3Var, j15Var, ql3Var, ki2Var, (ki2) L20, mi2Var, sk2Var2, (i3 & 14) | 3072 | ((i3 << 3) & 458752));
                sk2Var2.p(false);
                m55 r3 = sk2Var2.r();
                if (r3 != null) {
                    r3.d = new aj2() { // from class: z4
                        @Override // defpackage.aj2
                        public final Object j(Object obj2, Object obj3) {
                            int i12 = r10;
                            o27 o27Var = o27.a;
                            int i13 = i2;
                            switch (i12) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int I = ep2.I(i13 | 1);
                                    n40.k(zy3Var, list, set, aj2Var, mi2Var, aj2Var2, pk3Var, mi2Var2, (tu0) obj2, I);
                                    return o27Var;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int I2 = ep2.I(i13 | 1);
                                    n40.k(zy3Var, list, set, aj2Var, mi2Var, aj2Var2, pk3Var, mi2Var2, (tu0) obj2, I2);
                                    return o27Var;
                                default:
                                    ((Integer) obj3).getClass();
                                    int I3 = ep2.I(i13 | 1);
                                    n40.k(zy3Var, list, set, aj2Var, mi2Var, aj2Var2, pk3Var, mi2Var2, (tu0) obj2, I3);
                                    return o27Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r4 = sk2Var.r();
        if (r4 != null) {
            r4.d = new aj2() { // from class: z4
                @Override // defpackage.aj2
                public final Object j(Object obj2, Object obj3) {
                    int i12 = r10;
                    o27 o27Var = o27.a;
                    int i13 = i2;
                    switch (i12) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int I = ep2.I(i13 | 1);
                            n40.k(zy3Var, list, set, aj2Var, mi2Var, aj2Var2, pk3Var, mi2Var2, (tu0) obj2, I);
                            return o27Var;
                        case 1:
                            ((Integer) obj3).getClass();
                            int I2 = ep2.I(i13 | 1);
                            n40.k(zy3Var, list, set, aj2Var, mi2Var, aj2Var2, pk3Var, mi2Var2, (tu0) obj2, I2);
                            return o27Var;
                        default:
                            ((Integer) obj3).getClass();
                            int I3 = ep2.I(i13 | 1);
                            n40.k(zy3Var, list, set, aj2Var, mi2Var, aj2Var2, pk3Var, mi2Var2, (tu0) obj2, I3);
                            return o27Var;
                    }
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final defpackage.zy3 r18, final defpackage.ih4 r19, final java.util.List r20, final defpackage.mi2 r21, final defpackage.aj2 r22, defpackage.ih4 r23, defpackage.tu0 r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.l(zy3, ih4, java.util.List, mi2, aj2, ih4, tu0, int, int):void");
    }

    public static final void m(i71 i71Var, ki2 ki2Var, mi2 mi2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        i71 i71Var2;
        z31 z31Var;
        int i5;
        ki2Var.getClass();
        mi2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1504194021);
        int i6 = i2 | 2;
        if (sk2Var.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            sk2Var.T();
            if ((i2 & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
                i5 = i8 & (-15);
                i71Var2 = i71Var;
            } else {
                ab7 a2 = dr3.a(sk2Var);
                if (a2 != null) {
                    if (a2 instanceof lq2) {
                        z31Var = ((lq2) a2).getDefaultViewModelCreationExtras();
                    } else {
                        z31Var = x31.b;
                    }
                    i5 = i8 & (-15);
                    i71Var2 = (i71) mj2.c0(q75.a(i71.class), a2, null, z31Var, sk2Var);
                } else {
                    i.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            sk2Var.q();
            a71 a71Var = (a71) me2.m(i71Var2.e, sk2Var).getValue();
            boolean h2 = sk2Var.h(i71Var2);
            Object L = sk2Var.L();
            if (h2 || L == su0.a) {
                L = new y(i71Var2, (j11) null, 29);
                sk2Var.h0(L);
            }
            n(a71Var, ki2Var, mi2Var, (aj2) L, sk2Var, i5 & 1008);
        } else {
            sk2Var.R();
            i71Var2 = i71Var;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new w3(i71Var2, ki2Var, mi2Var, i2, 11);
        }
    }

    public static final void n(a71 a71Var, ki2 ki2Var, mi2 mi2Var, aj2 aj2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-661086427);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(a71Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(ki2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(mi2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.h(aj2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            if (de7.a(sk2Var, 0).a.a >= 840) {
                sk2Var.X(-2000294509);
                y(a71Var, ki2Var, mi2Var, aj2Var, sk2Var, i3 & 8190);
                sk2Var.p(false);
            } else {
                sk2Var.X(-2000088018);
                q(a71Var, ki2Var, mi2Var, aj2Var, sk2Var, i3 & 8190);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new c71(a71Var, ki2Var, mi2Var, aj2Var, i2, 0);
        }
    }

    public static final void o(zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(419579728);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ir6.b(me2.X(sk2Var, R.string.no_dsiware_roms_found), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 131070);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new g5(zy3Var, i2, 4, (byte) 0);
        }
    }

    public static final void p(zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(2032668943);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            zy3 X = b53.X(zy3Var, 32.0f);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, X);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ir6.b(me2.X(sk2Var, R.string.retro_achievements_no_achievements), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130558);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new g5(zy3Var, i2, 0, (byte) 0);
        }
    }

    public static final void q(a71 a71Var, ki2 ki2Var, mi2 mi2Var, aj2 aj2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-83231447);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(a71Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(ki2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(mi2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.h(aj2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i8 = i3;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            hi2.a(ki2Var, ct3.H0(479601184, new p4((Object) ki2Var, (Object) a71Var, mi2Var, (Object) aj2Var, 4), sk2Var), sk2Var, ((i8 >> 3) & 14) | 48);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new c71(a71Var, ki2Var, mi2Var, aj2Var, i2, 1);
        }
    }

    public static final void r(zy3 zy3Var, j15 j15Var, ql3 ql3Var, ki2 ki2Var, ki2 ki2Var2, mi2 mi2Var, tu0 tu0Var, int i2) {
        int i3;
        ql3 ql3Var2;
        ki2 ki2Var3;
        ki2 ki2Var4;
        mi2 mi2Var2;
        boolean z;
        sk2 sk2Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-951879649);
        if ((i2 & 6) == 0) {
            if (sk2Var2.f(zy3Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var2.h(j15Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            ql3Var2 = ql3Var;
            if (sk2Var2.f(ql3Var2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        } else {
            ql3Var2 = ql3Var;
        }
        if ((i2 & 3072) == 0) {
            ki2Var3 = ki2Var;
            if (sk2Var2.h(ki2Var3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            ki2Var3 = ki2Var;
        }
        if ((i2 & 24576) == 0) {
            ki2Var4 = ki2Var2;
            if (sk2Var2.h(ki2Var4)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        } else {
            ki2Var4 = ki2Var2;
        }
        if ((196608 & i2) == 0) {
            mi2Var2 = mi2Var;
            if (sk2Var2.h(mi2Var2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        } else {
            mi2Var2 = mi2Var;
        }
        int i10 = i3;
        if ((74899 & i10) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i10 & 1, z)) {
            h20 h20Var = y60.k0;
            mh4 q2 = b53.q(1, RecyclerView.A1);
            boolean h2 = sk2Var2.h(j15Var);
            if ((i10 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = h2 | z2;
            if ((i10 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z6 | z3;
            if ((458752 & i10) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            if ((57344 & i10) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            Object L = sk2Var2.L();
            if (z9 || L == su0.a) {
                e5 e5Var = new e5(ql3Var2, j15Var, ki2Var3, mi2Var2, ki2Var4);
                sk2Var2.h0(e5Var);
                L = e5Var;
            }
            sk2Var = sk2Var2;
            io2.b(zy3Var, null, q2, null, h20Var, null, false, null, (mi2) L, sk2Var, (i10 & 14) | 196992, 474);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new f5(zy3Var, j15Var, ql3Var, ki2Var, ki2Var2, mi2Var, i2);
        }
    }

    public static final void s(zy3 zy3Var, p15 p15Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        p15 p15Var2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-959915823);
        if (sk2Var.h(p15Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            zy3 Y = b53.Y(zy3Var, 16.0f, 8.0f);
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 k2 = o76.k(wy3.a, 56.0f);
            String g2 = wh1.g(p15Var.b, "#");
            ye6 ye6Var = d17.b;
            ds6 ds6Var = ((c17) sk2Var.j(ye6Var)).j;
            pe2 pe2Var = pe2.d0;
            ye6 ye6Var2 = ir0.a;
            ir6.b(g2, k2, ((hr0) sk2Var.j(ye6Var2)).i(), 0L, pe2Var, null, 0L, null, 0L, 0, false, 0, 0, null, ds6Var, sk2Var, 196656, 0, 65496);
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a3 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            p15Var2 = p15Var;
            ir6.b(p15Var2.a, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((c17) sk2Var.j(ye6Var)).i, sk2Var, 0, 3120, 55294);
            ir6.b(p15Var2.d, null, xq0.b(0.72f, ((hr0) sk2Var.j(ye6Var2)).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var.j(ye6Var)).j, sk2Var, 0, 0, 65530);
            sk2Var = sk2Var;
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            p15Var2 = p15Var;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new s4(i2, 0, zy3Var, p15Var2);
        }
    }

    public static final void t(zy3 zy3Var, final j15 j15Var, ql3 ql3Var, ki2 ki2Var, mi2 mi2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        final mi2 mi2Var2;
        String str;
        boolean z2;
        final mi2 mi2Var3;
        int i7;
        sn1 sn1Var;
        boolean z3;
        boolean z4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(564527569);
        if (sk2Var.h(j15Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i2 | i3;
        if (sk2Var.f(ql3Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (sk2Var.h(ki2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i11 & 1, z)) {
            h20 h20Var = y60.j0;
            mt mtVar = rt.c;
            lr0 a2 = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            wy3 wy3Var = wy3.a;
            zy3 c2 = o76.c(wy3Var, 1.0f);
            sr5 a3 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, c2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            oo2.c(ki2Var, null, false, ct3.Z, sk2Var, ((i11 >> 9) & 14) | 24576, 14);
            cg2.k(sk2Var, o76.k(wy3Var, 4.0f));
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a4 = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a4);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            String str2 = j15Var.g;
            ye6 ye6Var = d17.b;
            ir6.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, ((c17) sk2Var.j(ye6Var)).f, sk2Var, 0, 3120, 55294);
            if (ql3Var instanceof pl3) {
                sk2Var.X(661371107);
                str = me2.W(R.string.leaderboard_total_entries, new Object[]{Integer.valueOf(((pl3) ql3Var).a.b)}, sk2Var);
                sk2Var.p(false);
            } else {
                sk2Var.X(661500191);
                sk2Var.p(false);
                str = j15Var.e;
            }
            ds6 ds6Var = ((c17) sk2Var.j(ye6Var)).l;
            ye6 ye6Var2 = ir0.a;
            ir6.b(str, null, xq0.b(0.64f, ((hr0) sk2Var.j(ye6Var2)).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ds6Var, sk2Var, 0, 0, 65530);
            sk2 sk2Var2 = sk2Var;
            sk2Var2.p(true);
            int i12 = i11 & 57344;
            if (i12 == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h2 = sk2Var2.h(j15Var) | z2;
            Object L = sk2Var2.L();
            sn1 sn1Var2 = su0.a;
            if (!h2 && L != sn1Var2) {
                mi2Var3 = mi2Var;
            } else {
                mi2Var3 = mi2Var;
                L = new ki2() { // from class: t4
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i13 = r3;
                        o27 o27Var = o27.a;
                        j15 j15Var2 = j15Var;
                        mi2 mi2Var4 = mi2Var3;
                        switch (i13) {
                            case 0:
                                mi2Var4.n(j15Var2);
                                return o27Var;
                            default:
                                mi2Var4.n(j15Var2);
                                return o27Var;
                        }
                    }
                };
                sk2Var2.h0(L);
            }
            oo2.c((ki2) L, null, false, ct3.c0, sk2Var2, 24576, 14);
            sk2Var2.p(true);
            if (!zg6.B0(j15Var.h)) {
                sk2Var2.X(-83727040);
                zy3 b0 = b53.b0(wy3Var, 56.0f, 4.0f, 8.0f, RecyclerView.A1, 8);
                String str3 = j15Var.h;
                ds6 ds6Var2 = ((c17) sk2Var2.j(ye6Var)).j;
                sn1Var = sn1Var2;
                i7 = i12;
                mi2Var2 = mi2Var;
                ir6.b(str3, b0, xq0.b(0.72f, ((hr0) sk2Var2.j(ye6Var2)).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ds6Var2, sk2Var2, 48, 0, 65528);
                sk2Var2 = sk2Var2;
                sk2Var2.p(false);
            } else {
                i7 = i12;
                sn1Var = sn1Var2;
                mi2Var2 = mi2Var3;
                sk2Var2.X(-83445157);
                sk2Var2.p(false);
            }
            zy3 b02 = b53.b0(wy3Var, 48.0f, 4.0f, RecyclerView.A1, RecyclerView.A1, 12);
            if (i7 == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h3 = sk2Var2.h(j15Var) | z3;
            Object L2 = sk2Var2.L();
            if (!h3 && L2 != sn1Var) {
                z4 = true;
            } else {
                z4 = true;
                L2 = new ki2() { // from class: t4
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i13 = r3;
                        o27 o27Var = o27.a;
                        j15 j15Var2 = j15Var;
                        mi2 mi2Var4 = mi2Var2;
                        switch (i13) {
                            case 0:
                                mi2Var4.n(j15Var2);
                                return o27Var;
                            default:
                                mi2Var4.n(j15Var2);
                                return o27Var;
                        }
                    }
                };
                sk2Var2.h0(L2);
            }
            sk2 sk2Var3 = sk2Var2;
            l.k((ki2) L2, b02, false, null, ct3.d0, sk2Var3, 805306416, 508);
            sk2Var = sk2Var3;
            sk2Var.p(z4);
        } else {
            mi2Var2 = mi2Var;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new b4(zy3Var, j15Var, ql3Var, ki2Var, mi2Var2, i2);
        }
    }

    public static final void u(zy3 zy3Var, j15 j15Var, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(611316189);
        if (sk2Var.h(j15Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i2 | i3;
        if (sk2Var.h(ki2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            zy3 Y = b53.Y(a53.s(zy3Var, false, null, ki2Var, 15), 16.0f, 8.0f);
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            ax2 u2 = yf2.u();
            wy3 wy3Var = wy3.a;
            ev2.a(u2, null, o76.h(wy3Var, 52.0f), sn2.y(sk2Var).i(), sk2Var, 432, 0);
            cg2.k(sk2Var, o76.k(wy3Var, 12.0f));
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a3 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(j15Var.g, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, sn2.D(sk2Var).i, sk2Var, 0, 3120, 55294);
            sk2 sk2Var2 = sk2Var;
            if (!zg6.B0(j15Var.h)) {
                sk2Var2.X(-1702891504);
                ir6.b(j15Var.h, null, xq0.b(0.72f, sn2.y(sk2Var2).f()), 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, sn2.D(sk2Var2).j, sk2Var2, 0, 3120, 55290);
                sk2Var2 = sk2Var2;
                sk2Var2.p(false);
            } else {
                sk2Var2.X(-1702586433);
                sk2Var2.p(false);
            }
            sk2 sk2Var3 = sk2Var2;
            ir6.b(j15Var.e, null, xq0.b(0.56f, sn2.y(sk2Var2).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var2).l, sk2Var3, 0, 0, 65530);
            ir6.b(me2.X(sk2Var3, R.string.leaderboard_view_ranking), null, sn2.y(sk2Var3).i(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var3).l, sk2Var3, 0, 0, 65530);
            sk2Var = sk2Var3;
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new w3(zy3Var, j15Var, ki2Var, i2, 1);
        }
    }

    public static final void v(zy3 zy3Var, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(2119940746);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(ki2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            lr0 a2 = jr0.a(new ot(32.0f, true, new i(1)), y60.k0, sk2Var, 54);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ir6.b(me2.X(sk2Var, R.string.retro_achievements_load_error), null, 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130558);
            i4 = 0;
            sk2Var = sk2Var;
            l.c(ki2Var, null, false, null, null, pu.v(sk2Var), null, ct3.e0, sk2Var, ((i3 >> 3) & 14) | 805306368, 382);
            sk2Var.p(true);
        } else {
            i4 = 0;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new x4(zy3Var, ki2Var, i2, i4);
        }
    }

    public static final void w(zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(351969663);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            zy3 X = b53.X(zy3Var, 16.0f);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, X);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            yu4.a(null, 0L, RecyclerView.A1, 0L, 0, sk2Var, 0, 31);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new g5(zy3Var, i2, 5, (byte) 0);
        }
    }

    public static final void x(boolean z, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        long j2;
        long j3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1099344387);
        if (sk2Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (sk2Var.h(ki2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i6 & 1, z2)) {
            jd7 C = mj2.C(sk2Var);
            long j4 = jd7.p;
            i20 i20Var = y60.h0;
            fr5 b2 = gr5.b(13.0f);
            wy3 wy3Var = wy3.a;
            zy3 t2 = a53.t(wy3Var, b2);
            if (z) {
                j2 = j4;
            } else {
                j2 = C.d;
            }
            zy3 Y = b53.Y(a53.s(dk7.i(t2, j2, iq2.g), false, null, ki2Var, 15), 10.0f, 4.0f);
            sr5 a2 = rr5.a(rt.a, i20Var, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            qi4 J = ve2.J(sk2Var, R.drawable.ic_status_warn);
            if (z) {
                j4 = xq0.b;
            }
            ev2.b(J, null, o76.h(wy3Var, 11.0f), j4, sk2Var, 440, 0);
            cg2.k(sk2Var, o76.k(wy3Var, 4.0f));
            String X = me2.X(sk2Var, R.string.retro_achievements_filter_missable);
            if (z) {
                j3 = xq0.b;
            } else {
                j3 = C.i;
            }
            ir6.b(X, null, j3, hi2.A(8.5d), pe2.c0, td7.c, hi2.A(0.4d), null, 0L, 0, false, 1, 0, null, null, sk2Var, 14355456, 3072, 122642);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new v4(z, ki2Var, i2, 0);
        }
    }

    public static final void y(a71 a71Var, ki2 ki2Var, mi2 mi2Var, aj2 aj2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-289244578);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(a71Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(ki2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(mi2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.h(aj2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            mh7.a(me2.X(sk2Var, R.string.select_dsiware_title), ki2Var, ct3.H0(2112373737, new b71(a71Var, mi2Var, aj2Var, 1), sk2Var), ct3.H0(433906343, new sz(ki2Var, 5, (byte) 0), sk2Var), false, sk2Var, (i3 & 112) | 28032, 0);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new c71(a71Var, ki2Var, mi2Var, aj2Var, i2, 2);
        }
    }

    public static final void z(zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(2064964257);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            A(zy3Var, et0Var, sk2Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new wl(zy3Var, et0Var, i2, 0);
        }
    }
}
