package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.stormds.emulator.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* renamed from: u24  reason: default package */
/* loaded from: classes.dex */
public abstract class u24 {
    public static final zv0 a = new zv0(1568795229, false, new kw0(16));
    public static final zv0 b = new zv0(-254675756, false, new kw0(17));
    public static final zv0 c = new zv0(-1845141607, false, new fn0(26));
    public static final h45 d = new h45("list-item-type");
    public static final h45 e = new h45("bullet-list-item-level");
    public static final h45 f = new h45("ordered-list-item-number");
    public static final h45 g = new h45("heading-level");
    public static final h45 h = new h45("link-destination");
    public static final h45 i = new h45("paragraph-is-in-tight-list");
    public static final h45 j = new h45("code-block-info");
    public static final float[] k = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] l = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final jy2 m = new jy2(2);
    public static final of5 n = new of5(RecyclerView.B1, RecyclerView.B1, 10.0f, 10.0f);
    public static final tp5 o = new tp5(14);
    public static e33 p;
    public static e33 q;
    public static final /* synthetic */ int r = 0;
    public static e33 s;

    public static final a74 A(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new ah3(qn2Var, null));
    }

    public static final a74 B(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new ah3(null, qn2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ma0 C(yw2 yw2Var) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        yw2 yw2Var2 = yw2Var;
        yw2Var2.getClass();
        int size = yw2Var2.size();
        int i5 = 0;
        boolean z = true;
        String str3 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = -1;
        int i9 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i5 < size) {
            String b2 = yw2Var2.b(i5);
            String d2 = yw2Var2.d(i5);
            if (b2.equalsIgnoreCase("Cache-Control")) {
                if (str3 == null) {
                    str3 = d2;
                    i2 = 0;
                    while (i2 < d2.length()) {
                        int length = d2.length();
                        int i10 = i2;
                        while (true) {
                            if (i10 < length) {
                                i3 = size;
                                if (qs6.k0("=,;", d2.charAt(i10))) {
                                    break;
                                }
                                i10++;
                                size = i3;
                            } else {
                                i3 = size;
                                i10 = d2.length();
                                break;
                            }
                        }
                        String obj = qs6.T0(d2.substring(i2, i10)).toString();
                        if (i10 != d2.length() && d2.charAt(i10) != ',' && d2.charAt(i10) != ';') {
                            int i11 = i10 + 1;
                            byte[] bArr = yy7.a;
                            int length2 = d2.length();
                            while (true) {
                                if (i11 < length2) {
                                    char charAt = d2.charAt(i11);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = d2.length();
                                    break;
                                }
                            }
                            if (i11 < d2.length() && d2.charAt(i11) == '\"') {
                                int i12 = i11 + 1;
                                int s0 = qs6.s0('\"', i12, 4, d2);
                                str2 = d2.substring(i12, s0);
                                i4 = s0 + 1;
                            } else {
                                int length3 = d2.length();
                                int i13 = i11;
                                while (true) {
                                    if (i13 < length3) {
                                        int i14 = length3;
                                        if (qs6.k0(",;", d2.charAt(i13))) {
                                            break;
                                        }
                                        i13++;
                                        length3 = i14;
                                    } else {
                                        i13 = d2.length();
                                        break;
                                    }
                                }
                                int i15 = i13;
                                str2 = qs6.T0(d2.substring(i11, i13)).toString();
                                i4 = i15;
                            }
                        } else {
                            i4 = i10 + 1;
                            str2 = null;
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z3 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i6 = yy7.p(-1, str2);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = yy7.p(-1, str2);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z4 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z5 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z6 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i8 = yy7.p(Integer.MAX_VALUE, str2);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = yy7.p(-1, str2);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z7 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z8 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z9 = true;
                            }
                            i2 = i4;
                        }
                        size = i3;
                    }
                    i5++;
                    yw2Var2 = yw2Var;
                    size = size;
                }
            } else if (!b2.equalsIgnoreCase("Pragma")) {
                i5++;
                yw2Var2 = yw2Var;
                size = size;
            }
            z = false;
            i2 = 0;
            while (i2 < d2.length()) {
            }
            i5++;
            yw2Var2 = yw2Var;
            size = size;
        }
        if (!z) {
            str = null;
        } else {
            str = str3;
        }
        return new ma0(z2, z3, i6, i7, z4, z5, z6, i8, i9, z7, z8, z9, str);
    }

    public static int D(double d2) {
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
        i.h("Cannot round NaN value.");
        return 0;
    }

    public static int E(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        i.h("Cannot round NaN value.");
        return 0;
    }

    public static long F(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        i.h("Cannot round NaN value.");
        return 0L;
    }

    public static final Shader.TileMode G(int i2) {
        Shader.TileMode tileMode;
        if (i2 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i2 == 3) {
            if (Build.VERSION.SDK_INT >= 31) {
                tileMode = Shader.TileMode.DECAL;
                return tileMode;
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static byte[] H(xb1 xb1Var) {
        xb1Var.getClass();
        HashMap hashMap = xb1Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                I(dataOutputStream, (String) entry.getKey(), entry.getValue());
            }
            dataOutputStream.flush();
            if (dataOutputStream.size() <= 10240) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e2) {
            ga0.f().e(ac1.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void I(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        double d2;
        float f2;
        long j2;
        int i3;
        byte b2;
        boolean z;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ar0 a2 = gh5.a(objArr.getClass());
            if (a2.equals(gh5.a(Boolean[].class))) {
                i2 = 8;
            } else if (a2.equals(gh5.a(Byte[].class))) {
                i2 = 9;
            } else if (a2.equals(gh5.a(Integer[].class))) {
                i2 = 10;
            } else if (a2.equals(gh5.a(Long[].class))) {
                i2 = 11;
            } else if (a2.equals(gh5.a(Float[].class))) {
                i2 = 12;
            } else if (a2.equals(gh5.a(Double[].class))) {
                i2 = 13;
            } else if (a2.equals(gh5.a(String[].class))) {
                i2 = 14;
            } else {
                e41.A(gh5.a(objArr.getClass()).b(), "Unsupported value type ");
                return;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                String str2 = null;
                Boolean bool = null;
                Byte b3 = null;
                Integer num = null;
                Long l2 = null;
                Float f3 = null;
                Double d3 = null;
                if (i2 == 8) {
                    if (obj2 instanceof Boolean) {
                        bool = (Boolean) obj2;
                    }
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    dataOutputStream.writeBoolean(z);
                } else if (i2 == 9) {
                    if (obj2 instanceof Byte) {
                        b3 = (Byte) obj2;
                    }
                    if (b3 != null) {
                        b2 = b3.byteValue();
                    } else {
                        b2 = 0;
                    }
                    dataOutputStream.writeByte(b2);
                } else if (i2 == 10) {
                    if (obj2 instanceof Integer) {
                        num = (Integer) obj2;
                    }
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 0;
                    }
                    dataOutputStream.writeInt(i3);
                } else if (i2 == 11) {
                    if (obj2 instanceof Long) {
                        l2 = (Long) obj2;
                    }
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                    dataOutputStream.writeLong(j2);
                } else if (i2 == 12) {
                    if (obj2 instanceof Float) {
                        f3 = (Float) obj2;
                    }
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    } else {
                        f2 = RecyclerView.B1;
                    }
                    dataOutputStream.writeFloat(f2);
                } else if (i2 == 13) {
                    if (obj2 instanceof Double) {
                        d3 = (Double) obj2;
                    }
                    if (d3 != null) {
                        d2 = d3.doubleValue();
                    } else {
                        d2 = 0.0d;
                    }
                    dataOutputStream.writeDouble(d2);
                } else if (i2 == 14) {
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    }
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        } else {
            e41.A(gh5.a(obj.getClass()).c(), "Unsupported value type ");
            return;
        }
        dataOutputStream.writeUTF(str);
    }

    public static String J(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        if (i2 == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public static final void a(a74 a74Var, o75 o75Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        o75 o75Var2 = o75Var;
        a74Var.getClass();
        o75Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-835742261);
        if (xq2Var.f(a74Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (xq2Var.h(o75Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            boolean f2 = xq2Var.f(o75Var2);
            Object P = xq2Var.P();
            Object obj = ox0.a;
            if (f2 || P == obj) {
                P = np2.Y(h05.SHOW_ICON);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            boolean f3 = xq2Var.f(qa4Var);
            Object P2 = xq2Var.P();
            if (f3 || P2 == obj) {
                P2 = new x5(qa4Var, null, 0);
                xq2Var.l0(P2);
            }
            mb3.i(xq2Var, (eo2) P2, o75Var2);
            es7 es7Var = fs7.a;
            a74 g2 = g(dj6.m(400.0f, 1, nj2.E(ge7.O(a74Var, 16.0f), 12.0f, z16.b(13.0f), false, 0L, 28)), z16.b(13.0f));
            long j2 = es7Var.d;
            jy2 jy2Var = m;
            a74 I = ak7.I(vy7.L(g2, j2, jy2Var), 1.0f, kt0.c(0.35f, es7.p), z16.b(13.0f));
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, I);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            x64 x64Var = x64.a;
            a74 G = g04.G(ge7.O(x64Var, 8.0f), gb3.Min);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, G);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            a74 I2 = ak7.I(vy7.L(g(dj6.i(x64Var, 42.0f), z16.b(10.0f)), es7Var.m, jy2Var), 1.0f, es7Var.l, z16.b(10.0f));
            e34 d3 = h70.d(e40Var, false);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E3 = l.E(xq2Var, I2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d3);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            a74 i7 = dj6.i(x64Var, 42.0f);
            x23 x23Var = new x23((Context) xq2Var.j(kf.b));
            o75Var2 = o75Var;
            x23Var.c = o75Var2.j.toString();
            x23Var.b(false);
            gi2.a(x23Var.a(), i7, kj2.R(xq2Var, R.drawable.ic_trophy), kj2.R(xq2Var, R.drawable.ic_trophy), xq2Var, 37296);
            xq2Var.p(true);
            a74 b2 = dj6.b(x64Var, 1.0f);
            h05 h05Var = (h05) qa4Var.getValue();
            Object P3 = xq2Var.P();
            if (P3 == obj) {
                P3 = new k4(5);
                xq2Var.l0(P3);
            }
            f04.c(h05Var, b2, (qn2) P3, null, "content-animation", null, n16.I(-418559101, new w5(0, o75Var2, es7Var), xq2Var), xq2Var, 1597872, 40);
            xq2Var = xq2Var;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(a74Var, i2, 2, o75Var2);
        }
    }

    public static final tu0 b(Object obj) {
        tu0 tu0Var = new tu0();
        tu0Var.b0(obj);
        return tu0Var;
    }

    public static final void c(on2 on2Var, jj1 jj1Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        jj1 jj1Var2;
        int i4;
        int i5;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1926476888);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(on2Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i6 |= i4;
        }
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            jj1Var2 = new jj1(7, false, false);
            View view = (View) xq2Var.j(kf.f);
            vq2 T = ge7.T(xq2Var);
            qa4 b0 = np2.b0(zv0Var, xq2Var);
            qa4 b02 = np2.b0(on2Var, xq2Var);
            Object[] objArr = new Object[0];
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new c5(27);
                xq2Var.l0(P);
            }
            UUID uuid = (UUID) qo2.I(objArr, (on2) P, xq2Var, 48);
            Object P2 = xq2Var.P();
            oi1 oi1Var = P2;
            if (P2 == vs0Var) {
                uuid.getClass();
                oi1 oi1Var2 = new oi1(view, jj1Var2, uuid);
                zv0 zv0Var2 = new zv0(-1782407382, true, new e4(b0, 2));
                oi1Var2.setParentCompositionContext(T);
                oi1Var2.n0.setValue(zv0Var2);
                oi1Var2.m0 = true;
                oi1Var2.l0 = (on2) b02.getValue();
                xq2Var.l0(oi1Var2);
                oi1Var = oi1Var2;
            }
            oi1 oi1Var3 = (oi1) oi1Var;
            boolean h2 = xq2Var.h(oi1Var3);
            Object P3 = xq2Var.P();
            if (h2 || P3 == vs0Var) {
                P3 = new li1(oi1Var3, 0);
                xq2Var.l0(P3);
            }
            mb3.d(oi1Var3, (qn2) P3, xq2Var);
        } else {
            xq2Var.V();
            jj1Var2 = jj1Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(on2Var, jj1Var2, zv0Var, i2, 9);
        }
    }

    public static final float d(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(w57 w57Var, fo2 fo2Var, Throwable th, s41 s41Var) {
        ye2 ye2Var;
        int i2;
        try {
            if (s41Var instanceof ye2) {
                ye2 ye2Var2 = (ye2) s41Var;
                int i3 = ye2Var2.Y;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ye2Var2.Y = i3 - Integer.MIN_VALUE;
                    ye2Var = ye2Var2;
                    Object obj = ye2Var.X;
                    Object obj2 = x61.COROUTINE_SUSPENDED;
                    i2 = ye2Var.Y;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            th = ye2Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        ye2Var.R = th;
                        ye2Var.Y = 1;
                        if (fo2Var.e(w57Var, th, ye2Var) == obj2) {
                            return obj2;
                        }
                    }
                    return jg7.a;
                }
            }
            if (i2 == 0) {
            }
            return jg7.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                mb3.q(th2, th);
            }
            throw th2;
        }
        ye2Var = new s41(s41Var);
        Object obj3 = ye2Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i2 = ye2Var.Y;
    }

    public static a74 f(a74 a74Var) {
        of5 of5Var = vq7.a;
        return h(a74Var).d(new yi6(ge7.U(RecyclerView.B1, 400.0f, new q93(4294967297L), 1)));
    }

    public static final a74 g(a74 a74Var, ke6 ke6Var) {
        return hv.I(a74Var, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, ke6Var, 518143);
    }

    public static final a74 h(a74 a74Var) {
        return hv.I(a74Var, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, null, 520191);
    }

    public static final void i(db2 db2Var, lt4 lt4Var) {
        try {
            IOException iOException = null;
            for (lt4 lt4Var2 : db2Var.x(lt4Var)) {
                try {
                    if (db2Var.A(lt4Var2).c) {
                        i(db2Var, lt4Var2);
                    }
                    db2Var.r(lt4Var2);
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

    public static uj1 j() {
        if (uj1.B != null) {
            return uj1.B;
        }
        synchronized (uj1.class) {
            try {
                if (uj1.B == null) {
                    uj1.B = new uj1(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uj1.B;
    }

    public static xb1 k(byte[] bArr) {
        boolean z;
        bArr.getClass();
        if (bArr.length <= 10240) {
            if (bArr.length == 0) {
                return xb1.b;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[2];
                byteArrayInputStream.read(bArr2);
                int i2 = 0;
                if (bArr2[0] == -84 && bArr2[1] == -19) {
                    z = true;
                } else {
                    z = false;
                }
                byteArrayInputStream.reset();
                if (z) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt = objectInputStream.readInt();
                        while (i2 < readInt) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i2++;
                        }
                        objectInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ge7.t(objectInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort == -21521) {
                            short readShort2 = dataInputStream.readShort();
                            if (readShort2 != 1) {
                                u34.f(lb1.g(readShort2, "Unsupported version number: "));
                            }
                        } else {
                            u34.f(lb1.g(readShort, "Magic number doesn't match: "));
                        }
                        int readInt2 = dataInputStream.readInt();
                        while (i2 < readInt2) {
                            linkedHashMap.put(dataInputStream.readUTF(), l(dataInputStream, dataInputStream.readByte()));
                            i2++;
                        }
                        dataInputStream.close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            ge7.t(dataInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } catch (IOException e2) {
                ga0.f().e(ac1.a, "Error in Data#fromByteArray: ", e2);
            } catch (ClassNotFoundException e3) {
                ga0.f().e(ac1.a, "Error in Data#fromByteArray: ", e3);
            }
            return new xb1(linkedHashMap);
        }
        i.m("Data cannot occupy more than 10240 bytes when serialized");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String[], java.io.Serializable] */
    public static final Serializable l(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        } else if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        } else if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        } else if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        } else if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        } else if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        } else if (b2 == 14) {
            int readInt7 = dataInputStream.readInt();
            ?? r1 = new String[readInt7];
            while (i2 < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (nb3.k(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                r1[i2] = readUTF;
                i2++;
            }
            return r1;
        } else {
            i.m(lb1.g(b2, "Unsupported type "));
            return null;
        }
    }

    public static dn0 m(an0 an0Var) {
        an0Var.getClass();
        Long l2 = an0Var.a;
        String str = an0Var.b;
        ArrayList arrayList = an0Var.c;
        ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Cheat cheat = (Cheat) obj;
            cheat.getClass();
            arrayList2.add(new ho0(cheat.getId(), cheat.getCheatDatabaseId(), cheat.getName(), cheat.getDescription(), cheat.getCode(), cheat.getEnabled()));
        }
        return new dn0(l2, str, arrayList2);
    }

    public static final p94 n(ab6 ab6Var, qn2 qn2Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            xa6 a2 = ab6Var.a();
            sm3 sm3Var = a2.c;
            if (sm3Var.I() && sm3Var.H()) {
                of5 g2 = a2.g();
                p94 p94Var = new p94(48);
                s35 s35Var = new s35(8);
                s35Var.D(ln2.W(g2));
                q(qn2Var, p94Var, new s35(8), s35Var, a2, a2);
                return p94Var;
            }
            p94 p94Var2 = h93.a;
            p94Var2.getClass();
            return p94Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void o(qn2 qn2Var, p94 p94Var, s35 s35Var, s35 s35Var2, xa6 xa6Var, xa6 xa6Var2) {
        boolean z;
        s35 s35Var3 = s35Var;
        Region region = (Region) s35Var3.A;
        s35 s35Var4 = s35Var2;
        Region region2 = (Region) s35Var4.A;
        sm3 sm3Var = xa6Var2.c;
        sm3 sm3Var2 = xa6Var2.c;
        if (sm3Var.I() && sm3Var2.H() && !region2.isEmpty()) {
            of5 m2 = xa6Var2.m();
            if (m2.f()) {
                va6 f2 = xa6Var2.f();
                if (f2 == null) {
                    y53 y53Var = (y53) sm3Var2.B0.d;
                    m2 = ej2.w(y53Var).O(y53Var, false);
                } else {
                    z64 z64Var = ((z64) f2).A;
                    Object g2 = xa6Var2.d.A.g(sa6.b);
                    if (g2 == null) {
                        g2 = null;
                    }
                    if (g2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m2 = bl2.t(z64Var, z, false);
                }
            }
            m93 W = ln2.W(m2);
            s35Var3.D(W);
            if (region.op(region2, Region.Op.INTERSECT)) {
                int i2 = xa6Var2.f;
                if (i2 == xa6Var.f) {
                    i2 = -1;
                }
                Rect bounds = region.getBounds();
                p94Var.i(i2, new za6(xa6Var2, new m93(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                List j2 = xa6.j(4, xa6Var2);
                int size = j2.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) qn2Var.g(j2.get(size))).booleanValue()) {
                        o(qn2Var, p94Var, s35Var3, s35Var4, xa6Var, (xa6) j2.get(size));
                    }
                    size--;
                    s35Var3 = s35Var;
                    s35Var4 = s35Var2;
                }
                if (w(xa6Var2)) {
                    region2.op(W.a, W.b, W.c, W.d, Region.Op.DIFFERENCE);
                }
            }
        } else if (xa6Var2.o()) {
            p(p94Var, xa6Var, xa6Var2);
        }
    }

    public static final void p(p94 p94Var, xa6 xa6Var, xa6 xa6Var2) {
        of5 of5Var;
        sm3 sm3Var;
        xa6 l2 = xa6Var2.l();
        if (l2 != null && (sm3Var = l2.c) != null && sm3Var.I()) {
            of5Var = l2.g();
        } else {
            of5Var = n;
        }
        int i2 = xa6Var2.f;
        if (i2 == xa6Var.f) {
            i2 = -1;
        }
        p94Var.i(i2, new za6(xa6Var2, ln2.W(of5Var)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (r5 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(qn2 qn2Var, p94 p94Var, s35 s35Var, s35 s35Var2, xa6 xa6Var, xa6 xa6Var2) {
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        of5 t;
        qn2 qn2Var2 = qn2Var;
        p94 p94Var2 = p94Var;
        int i2 = xa6Var.f;
        Region region = (Region) s35Var.A;
        s35 s35Var3 = s35Var2;
        Region region2 = (Region) s35Var3.A;
        sm3 sm3Var = xa6Var2.c;
        ta6 ta6Var = xa6Var2.d;
        sm3 sm3Var2 = xa6Var2.c;
        int i3 = xa6Var2.f;
        if (sm3Var.I() && sm3Var2.H()) {
            z = false;
        } else {
            z = true;
        }
        if (!region2.isEmpty() || i3 == i2) {
            if (!z || xa6Var2.o()) {
                m93 W = ln2.W(xa6Var2.m());
                s35Var.D(W);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (region.op(region2, Region.Op.INTERSECT)) {
                    Rect bounds = region.getBounds();
                    p94Var2.i(i3, new za6(xa6Var2, new m93(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    List j2 = xa6.j(4, xa6Var2);
                    if (ta6Var.L) {
                        xa6 l2 = xa6Var2.l();
                        while (true) {
                            if (l2 != null) {
                                ja4 ja4Var = l2.d.A;
                                if (ja4Var.c(bb6.w) || ja4Var.c(bb6.v)) {
                                    break;
                                }
                                l2 = l2.l();
                            } else {
                                l2 = null;
                                break;
                            }
                        }
                        if (l2 != null) {
                            jk3 d2 = xa6Var2.d();
                            if (d2 != null) {
                                if (!d2.Y0().j0) {
                                    d2 = null;
                                }
                            }
                            d2 = null;
                            eg4 d3 = l2.d();
                            if (d3 != null) {
                                if (!d3.Y0().j0) {
                                    d3 = null;
                                }
                            }
                            d3 = null;
                            if (d2 != null && d3 != null) {
                                of5 O = d3.O(d2, false);
                                z2 = !O.equals(O.e(kj2.b(0L, qo2.S(d3.L))));
                                if (z2) {
                                    s35 s35Var4 = new s35(8);
                                    va6 f2 = xa6Var2.f();
                                    if (f2 == null) {
                                        y53 y53Var = (y53) sm3Var2.B0.d;
                                        t = ej2.w(y53Var).O(y53Var, false);
                                    } else {
                                        z64 z64Var = ((z64) f2).A;
                                        Object g2 = ta6Var.A.g(sa6.b);
                                        if (g2 == null) {
                                            obj = null;
                                        } else {
                                            obj = g2;
                                        }
                                        if (obj != null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        t = bl2.t(z64Var, z3, false);
                                    }
                                    s35Var4.D(ln2.W(t));
                                    int size = j2.size() - 1;
                                    while (-1 < size) {
                                        if (!((Boolean) qn2Var2.g(j2.get(size))).booleanValue()) {
                                            o(qn2Var2, p94Var2, new s35(8), s35Var4, xa6Var, (xa6) j2.get(size));
                                        }
                                        size--;
                                        p94Var2 = p94Var;
                                    }
                                    if (!w(xa6Var2)) {
                                        region2.op(W.a, W.b, W.c, W.d, Region.Op.DIFFERENCE);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                    int size2 = j2.size() - 1;
                    while (-1 < size2) {
                        if (!((Boolean) qn2Var2.g(j2.get(size2))).booleanValue()) {
                            q(qn2Var2, p94Var, s35Var, s35Var3, xa6Var, (xa6) j2.get(size2));
                        }
                        size2--;
                        qn2Var2 = qn2Var;
                        s35Var3 = s35Var2;
                    }
                    if (!w(xa6Var2)) {
                    }
                } else if (xa6Var2.o()) {
                    p(p94Var2, xa6Var, xa6Var2);
                } else if (i3 == -1) {
                    Rect bounds2 = region.getBounds();
                    p94Var2.i(i3, new za6(xa6Var2, new m93(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                }
            }
        }
    }

    public static ColorStateList r(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && yz0.u(drawable)) {
            colorStateList = yz0.e(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static ArrayList s(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static lx2 t() {
        if (lx2.L != null) {
            return lx2.L;
        }
        synchronized (lx2.class) {
            try {
                if (lx2.L == null) {
                    lx2.L = new lx2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lx2.L;
    }

    public static ec3 u() {
        if (ec3.L != null) {
            return ec3.L;
        }
        synchronized (ec3.class) {
            try {
                if (ec3.L == null) {
                    ec3.L = new ec3();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ec3.L;
    }

    public static final boolean v(xa6 xa6Var) {
        boolean z;
        eg4 d2 = xa6Var.d();
        ja4 ja4Var = xa6Var.d.A;
        if (d2 != null) {
            z = d2.g1();
        } else {
            z = false;
        }
        if (!z && !ja4Var.c(bb6.q) && !ja4Var.c(bb6.p)) {
            return false;
        }
        return true;
    }

    public static final boolean w(xa6 xa6Var) {
        if (!v(xa6Var)) {
            ta6 ta6Var = xa6Var.d;
            if (!ta6Var.L) {
                ja4 ja4Var = ta6Var.A;
                Object[] objArr = ja4Var.b;
                Object[] objArr2 = ja4Var.c;
                long[] jArr = ja4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    Object obj2 = objArr2[i5];
                                    if (((fb6) obj).c) {
                                        return true;
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static ov2 x() {
        if (g04.a != null) {
            return g04.a;
        }
        synchronized (g04.class) {
            try {
                if (g04.a == null) {
                    g04.a = new ov2(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g04.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long y(int i2, int i3, String str) {
        boolean z;
        char c2;
        int i4;
        long j2;
        char c3;
        char c4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        char c5;
        float f2;
        float f3;
        int i10;
        int i11;
        char c6;
        char c7;
        int i12;
        int i13;
        char c8;
        int i14;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (i2 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
        }
        char charAt = str.charAt(i2);
        if (charAt == '-') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (i4 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
            c2 = str.charAt(i4);
            if (((char) (c2 - '0')) >= '\n' && c2 != '.') {
                return (i4 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
        } else {
            c2 = charAt;
            i4 = i2;
        }
        int length = str.length();
        long j5 = 0;
        int i15 = i4;
        long j6 = 0;
        while (true) {
            if (i15 != i3) {
                j2 = j4;
                int i16 = c2 - '0';
                if (((char) i16) >= '\n') {
                    break;
                }
                j6 = (j6 * 10) + i16;
                i15++;
                if (i15 < length) {
                    c2 = str.charAt(i15);
                } else {
                    c2 = 0;
                }
                j4 = j2;
            } else {
                j2 = j4;
                break;
            }
        }
        int i17 = i15 - i4;
        char c9 = '0';
        if (i15 != i3 && c2 == '.') {
            int i18 = i15 + 1;
            c3 = ' ';
            i5 = i18;
            while (true) {
                c4 = 1;
                if (i3 - i5 >= 4) {
                    i13 = i18;
                    long charAt2 = str.charAt(i5) | (str.charAt(i5 + 1) << 16) | (str.charAt(i5 + 2) << 32) | (str.charAt(i5 + 3) << 48);
                    long j7 = charAt2 - 13511005043687472L;
                    if ((((charAt2 + 19703549022044230L) | j7) & (-35747867511423104L)) != 0) {
                        i14 = -1;
                    } else {
                        i14 = (int) ((j7 * 281475406208040961L) >>> 48);
                    }
                    if (i14 < 0) {
                        break;
                    }
                    j6 = (j6 * 10000) + i14;
                    i5 += 4;
                    i18 = i13;
                } else {
                    i13 = i18;
                    break;
                }
            }
            if (i5 < length) {
                c8 = str.charAt(i5);
            } else {
                c8 = 0;
            }
            loop2: while (true) {
                c2 = c8;
                while (i5 != i3) {
                    int i19 = c2 - '0';
                    if (((char) i19) >= '\n') {
                        break loop2;
                    }
                    j6 = (j6 * 10) + i19;
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    c2 = 0;
                }
                c8 = str.charAt(i5);
            }
            i7 = i13 - i5;
            i17 -= i7;
            i6 = i13;
        } else {
            c3 = ' ';
            c4 = 1;
            i5 = i15;
            i6 = i5;
            i7 = 0;
        }
        if (i17 == 0) {
            return (i5 << c3) | (Float.floatToRawIntBits(Float.NaN) & j2);
        }
        if ((c2 | ' ') == 101) {
            i8 = i5 + 1;
            if (i8 < length) {
                c6 = str.charAt(i8);
            } else {
                c6 = 0;
            }
            if (c6 == '-') {
                c7 = c4;
            } else {
                c7 = 0;
            }
            if (c7 != 0 || c6 == '+') {
                i8 = i5 + 2;
            }
            char charAt3 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 != i3) {
                    int i20 = charAt3 - c9;
                    i12 = i7;
                    if (((char) i20) >= '\n') {
                        break;
                    }
                    if (i9 < 1024) {
                        i9 = (i9 * 10) + i20;
                    }
                    i8++;
                    if (i8 < length) {
                        charAt3 = str.charAt(i8);
                    } else {
                        charAt3 = 0;
                    }
                    i7 = i12;
                    c9 = '0';
                } else {
                    i12 = i7;
                    break;
                }
            }
            if (c7 != 0) {
                i9 = -i9;
            }
            i7 = i12 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i21 = 19;
        if (i17 > 19) {
            char charAt4 = str.charAt(i4);
            int i22 = i4;
            while (true) {
                if (i8 != i3) {
                    if (charAt4 != '0' && charAt4 != '.') {
                        i10 = 19;
                        break;
                    }
                    if (charAt4 == '0') {
                        i17--;
                    }
                    i22++;
                    if (i22 < length) {
                        charAt4 = str.charAt(i22);
                    } else {
                        charAt4 = 0;
                    }
                    i21 = 19;
                } else {
                    i10 = i21;
                    break;
                }
            }
            if (i17 > i10) {
                char charAt5 = str.charAt(i4);
                long j8 = 0;
                while (true) {
                    i11 = i4;
                    if (i4 == i15 || Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j8 = (j8 * 10) + (charAt5 - '0');
                    i4 = i11 + 1;
                    if (i4 < length) {
                        charAt5 = str.charAt(i4);
                    } else {
                        charAt5 = 0;
                    }
                }
                if (Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                    i7 = (i15 - i11) + i9;
                } else {
                    char charAt6 = str.charAt(i6);
                    int i23 = i6;
                    while (i23 != i5 && Long.compare(j8 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                        j8 = (j8 * 10) + (charAt6 - '0');
                        i23++;
                        if (i23 < length) {
                            charAt6 = str.charAt(i23);
                        } else {
                            charAt6 = 0;
                        }
                    }
                    i7 = (i6 - i23) + i9;
                }
                j3 = j8;
                c5 = c4;
                if (-10 > i7 && i7 < 11 && c5 == 0 && Long.compare(j3 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                    float f4 = (float) j3;
                    float[] fArr = k;
                    if (i7 < 0) {
                        f3 = f4 / fArr[-i7];
                    } else {
                        f3 = f4 * fArr[i7];
                    }
                    if (z) {
                        f3 = -f3;
                    }
                    return (i8 << c3) | (Float.floatToRawIntBits(f3) & j2);
                } else if (j3 != 0) {
                    if (z) {
                        f2 = -0.0f;
                    } else {
                        f2 = RecyclerView.B1;
                    }
                    return (i8 << c3) | (Float.floatToRawIntBits(f2) & j2);
                } else if (-126 <= i7 && i7 < 128) {
                    long j9 = l[i7 + 325];
                    int numberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
                    long j10 = j3 << numberOfLeadingZeros;
                    long j11 = j10 & j2;
                    long j12 = j10 >>> c3;
                    long j13 = j9 & j2;
                    long j14 = j9 >>> c3;
                    long j15 = j12 * j14;
                    long j16 = j14 * j11;
                    long j17 = j15 + ((((j12 * j13) + ((j11 * j13) >>> c3)) + (j16 & j2)) >>> c3) + (j16 >>> c3);
                    int i24 = (int) (j17 >>> 63);
                    long j18 = j17 >>> (i24 + 9);
                    int i25 = numberOfLeadingZeros + (i24 ^ 1);
                    long j19 = j17 & 511;
                    if (j19 != 511 && (j19 != 0 || (3 & j18) != 1)) {
                        long j20 = (j18 + 1) >>> c4;
                        if (j20 >= 9007199254740992L) {
                            i25--;
                            j20 = 4503599627370496L;
                        }
                        long j21 = j20 & (-4503599627370497L);
                        long j22 = (((i7 * 217706) >> 16) + 1087) - i25;
                        if (j22 >= 1 && j22 <= 2046) {
                            long j23 = (j22 << 52) | j21;
                            if (z) {
                                j5 = Long.MIN_VALUE;
                            }
                            return (i8 << c3) | (Float.floatToRawIntBits((float) Double.longBitsToDouble(j23 | j5)) & j2);
                        }
                        return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                    }
                    return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                } else {
                    return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                }
            }
        }
        j3 = j6;
        c5 = 0;
        if (-10 > i7) {
        }
        if (j3 != 0) {
        }
    }

    public static final a74 z(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new ol4(qn2Var));
    }
}
