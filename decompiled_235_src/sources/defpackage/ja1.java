package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.Settings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja1  reason: default package */
/* loaded from: classes.dex */
public final class ja1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object d0;
    public Object e0;
    public Object f0;
    public Object g0;
    public Object h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
        this.f0 = obj4;
        this.g0 = obj5;
        this.h0 = obj6;
        this.i0 = obj7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (r9.e(r8) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0090, B:22:0x0092, B:25:0x0099, B:33:0x00a9, B:34:0x00ab, B:36:0x00b1, B:39:0x00b8), top: B:44:0x000b }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [x61, fb4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object A(Object obj) {
        ab4 ab4Var;
        hb4 hb4Var;
        qn2 qn2Var;
        Throwable th;
        ab4 ab4Var2;
        fb4 fb4Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        db4 db4Var = (db4) this.h0;
        ?? r1 = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            db4Var = (db4) this.d0;
                            fb4Var = (fb4) this.Z;
                            ab4Var2 = (ab4) this.f0;
                            try {
                                oi2.Y(obj);
                                atomicReference2 = db4Var.a;
                                while (!atomicReference2.compareAndSet(ab4Var2, null) && atomicReference2.get() == ab4Var2) {
                                }
                                fb4Var.h(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = db4Var.a;
                                while (!atomicReference.compareAndSet(ab4Var2, null) && atomicReference.get() == ab4Var2) {
                                }
                                throw th;
                            }
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    db4Var = (db4) this.e0;
                    ab4 ab4Var3 = (ab4) this.f0;
                    oi2.Y(obj);
                    qn2Var = (qn2) this.d0;
                    ab4Var = ab4Var3;
                    hb4Var = (fb4) this.Z;
                } else {
                    oi2.Y(obj);
                    j61 Z = ((w61) this.f0).A().Z(vs0.h0);
                    Z.getClass();
                    ab4Var = new ab4((xa4) this.g0, (rc3) Z);
                    db4.a(db4Var, ab4Var);
                    hb4Var = db4Var.b;
                    qn2Var = (qn2) this.i0;
                    this.f0 = ab4Var;
                    this.Z = hb4Var;
                    this.d0 = qn2Var;
                    this.e0 = db4Var;
                    this.Y = 1;
                }
                this.f0 = ab4Var;
                this.Z = hb4Var;
                this.d0 = db4Var;
                this.e0 = null;
                this.Y = 2;
                Object g = qn2Var.g(this);
                if (g != r1) {
                    fb4Var = hb4Var;
                    obj = g;
                    ab4Var2 = ab4Var;
                    atomicReference2 = db4Var.a;
                    while (!atomicReference2.compareAndSet(ab4Var2, null)) {
                        while (!atomicReference2.compareAndSet(ab4Var2, null)) {
                        }
                    }
                    fb4Var.h(null);
                    return obj;
                }
                return r1;
            } catch (Throwable th3) {
                th = th3;
                ab4Var2 = ab4Var;
                atomicReference = db4Var.a;
                while (!atomicReference.compareAndSet(ab4Var2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.h(null);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
        if (r8 == r7) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v136, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v140, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v143, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v145, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v147, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v151, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v153, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v158, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v161, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v164, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object v(Object obj) {
        String str;
        String str2;
        lp2 lp2Var;
        Object b;
        lp2 lp2Var2;
        Object c;
        String str3;
        Long l;
        Object S;
        String str4;
        boolean contains;
        lp2 lp2Var3;
        yt1 yt1Var;
        yt1 yt1Var2;
        Long l2;
        yt1 yt1Var3;
        yl5 yl5Var;
        String str5 = (String) this.g0;
        MelonDatabase melonDatabase = (MelonDatabase) this.h0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            oi2.Y(obj);
                            return Boolean.TRUE;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.d0;
                    str4 = (String) this.Z;
                    oi2.Y(obj);
                    lp2Var2 = (lp2) this.e0;
                    S = obj;
                    if (((List) S).isEmpty()) {
                        return Boolean.TRUE;
                    }
                    str3 = str4;
                    String S0 = qs6.S0(4, str3);
                    Locale locale = Locale.ROOT;
                    String upperCase = S0.toUpperCase(locale);
                    upperCase.getClass();
                    String S02 = qs6.S0(3, upperCase);
                    String upperCase2 = str5.toUpperCase(locale);
                    upperCase2.getClass();
                    contains = hf.c0("IPKE", "IPKJ", "IPKP", "IPKD", "IPKS", "IPKI").contains(upperCase);
                    yt1 yt1Var4 = yt1.A;
                    String str6 = str2;
                    if (contains) {
                        lp2Var3 = lp2Var2;
                        if (!hf.c0("E4B0DC73", "020F423F").contains(upperCase2)) {
                            if (hf.c0("IPGE", "IPGJ", "IPGP", "IPGD", "IPGS", "IPGI").contains(upperCase)) {
                                yt1Var = hf.c0(new td5("Основное и валюта", hf.c0(new sd5("Максимум денег (999,999$)", "Нажмите L+R", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n00000088 000F423F\nD2000000 00000000"), new sd5("Максимум очков BP (9,999)", "Нажмите L+R", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n10000090 0000270F\nD2000000 00000000"))), new td5("Ловля и покемоны", hf.c0(new sd5("100% Шанс поимки", "100% успешный захват любым покеболом", "92247612 00002801\n12247612 00004280\nD0000000 00000000"), new sd5("Все покемоны Shiny", "Блестящие дикие покемоны", "0206D0BC 47084900\n0206D0C0 02000001\nE2000000 00000020\n68004804 49042040\n47086840 00000000\n0206D0C5 00000000"))));
                            } else if (hf.c0("CPUE", "CPUJ", "CPUP", "CPUD", "CPUS", "CPUI").contains(upperCase)) {
                                yt1Var = hf.c0(new td5("Экономика и инвентарь", hf.c0(new sd5("Максимум денег (999,999$)", "Нажмите L+R", "94000130 FCFF0000\nB2101140 00000000\n00000090 000F423F\nD2000000 00000000"), new sd5("Все Pokéballs x995", "Нажмите L+R для наполнения сумки", "94000130 FCFF0000\nB2101140 00000000\nE0000D00 00000040\n03E30001 03E30002\n03E30003 03E30004\nD2000000 00000000"))), new td5("Битвы и путешествия", hf.c0(new sd5("100% Успешный захват", "Любой шар ловит без осечек", "922467FA 00002801\n122467FA 00004280\nD0000000 00000000"), new sd5("Проход сквозь стены (Hold B)", "Удерживайте кнопку B во время движения", "120610BE 00000200\n94000130 FDFD0000\n120610BE 00001C20\nD0000000 00000000"))));
                            } else if (hf.c0("ADAE", "ADAJ", "ADAP", "ADAD", "APAE", "APAJ", "APAP", "APAD").contains(upperCase)) {
                                yt1Var = hf.b0(new td5("Экономика и предметы", hf.c0(new sd5("Максимум денег (999,999$)", "Нажмите L+R", "94000130 FCFF0000\nB2101140 00000000\n00000090 000F423F\nD2000000 00000000"), new sd5("100% Захват покемонов", "Всегда успешная поимка", "922467FA 00002801\n122467FA 00004280\nD0000000 00000000"))));
                            } else if (hf.c0("IRBO", "IRBJ", "IRAE", "IRAJ", "IREO", "IREJ", "IRDO", "IRDJ", "IRDF", "IRDD").contains(upperCase)) {
                                yt1Var = hf.c0(new td5("Деньги и предметы", hf.c0(new sd5("Максимум денег (9,999,999$)", "Нажмите Select", "94000130 FFFB0000\n0223CC0C 0098967F\nD2000000 00000000"), new sd5("Бесконечные репелы от покемонов", "Шаги репела не заканчиваются", "12019688 000000FA"))), new td5("Битвы и опыт", hf.c0(new sd5("100% Захват диких покемонов", "Любой покебол ловит сразу", "521CA2EC D1062800\n121CA2F0 000046C0\nD2000000 00000000"), new sd5("Быстрая прокачка (Опыт x16)", "Умножение опыта в 16 раз", "521CC5DC 0C040400\n021CC5E0 00040400\nD2000000 00000000"))));
                            } else if (!hf.c0("UBTE", "UBTJ", "BBTE", "BBTJ").contains(upperCase) && !upperCase2.equals("08D5D422")) {
                                if (hf.c0("A2DE", "A2DJ", "A2DP").contains(upperCase)) {
                                    yt1Var = hf.b0(new td5("Жизни и форма", hf.c0(new sd5("Бесконечные жизни (99)", "99 жизней Марио", "0208AC64 00000063"), new sd5("Всегда Мега-Марио (Hold L)", "Удерживайте L при входе в уровень", "94000130 FDFF0000\n0208AC68 00000003\nD0000000 00000000"), new sd5("Бесконечное время на уровне", "Таймер зафиксирован", "1208AC70 00000384"))));
                                } else if (hf.c0("ASME", "ASMJ", "ASMP").contains(upperCase)) {
                                    yt1Var = hf.b0(new td5("Марио и звезды", hf.c0(new sd5("Бесконечное здоровье (8 секторов)", "Максимальное HP", "0209A7F8 00000800"), new sd5("Все 150 Звезд открыты", "Мгновенный доступ ко всем дверям замка", "0209A7FC 00000096"), new sd5("Супер-высокий прыжок (Hold A)", "Прыжок в небеса", "94000130 FFFE0000\n0209A810 00003000\nD0000000 00000000"))));
                                } else if (hf.c0("AMCE", "AMCJ", "AMCP").contains(upperCase)) {
                                    yt1Var = hf.b0(new td5("Гонка и предметы", hf.c0(new sd5("Всегда синий панцирь (Blue Spiny Shell)", "Используйте предмет в любой момент", "02165038 00000008"), new sd5("Бесконечные грибы ускорения (Mushrooms)", "Ускорение не заканчивается", "02165040 00000003"), new sd5("Все кубки и персонажи открыты", "Полный ростер гонщиков", "02165080 FFFFFFFF"))));
                                } else if (hf.c0("AZEE", "AZEJ", "AZEP").contains(upperCase)) {
                                    yt1Var = hf.b0(new td5("Линк и ресурсы", hf.c0(new sd5("Бесконечное здоровье (Все сердца)", "Линк не теряет HP", "02163420 00000040"), new sd5("Максимум рупий (9999)", "Полный кошелек", "12163424 0000270F"), new sd5("Бесконечный песок в Песочных часах", "Время в Храме Океана не убывает", "02163430 00003A98"))));
                                } else if (hf.c0("BKIE", "BKIJ", "BKIP").contains(upperCase)) {
                                    yt1Var = hf.b0(new td5("Линк и поезд", hf.c0(new sd5("Бесконечное HP Линка", "Бессмертие в подземельях", "0215F120 00000040"), new sd5("Максимум рупий (9999)", "9999 рупий", "1215F124 0000270F"), new sd5("Неуязвимость Поезда", "Поезд не получает урона от бомб и врагов", "0215F130 00000064"))));
                                } else if (hf.c0("ACVE", "ACVJ", "ACVP", "BQRE", "BQRJ", "BQRP", "YC3E", "YC3J", "YC3P").contains(upperCase)) {
                                    yt1Var = hf.c0(new td5("Здоровье и магия", hf.c0(new sd5("Бесконечное HP", "Сома / Джонатан / Шаноа бессмертны", "020F7140 000003E7"), new sd5("Бесконечное MP", "Магия не истощается", "020F7144 000003E7"), new sd5("Максимум золота (9,999,999)", "Полный баланс", "020F7150 0098967F"))), new td5("Души и глифы", hf.c0(new sd5("100% Шанс выпадения Душ / Глифов", "Каждый враг отдает свою душу при поражении", "020F7160 00000064"), new sd5("Быстрая прокачка (Опыт x10)", "Опыт за врагов умножен на 10", "020F7148 000F4240"))));
                                } else if (hf.c0("AGQE", "BG3E", "AGME", "BG3J", "AGQJ", "AGMJ").contains(upperCase)) {
                                    yt1Var = hf.b0(new td5("Судебный процесс", hf.c0(new sd5("Бесконечное доверие судьи (HP)", "Здоровье защиты никогда не убывает при ошибках", "020EA210 00000005"), new sd5("Все улики в материалах дела", "Мгновенный доступ ко всем уликам", "020EA220 FFFFFFFF"))));
                                } else if (hf.c0("AL5E", "CLJE", "C3JE", "AL5J", "CLJJ").contains(upperCase)) {
                                    yt1Var = hf.b0(new td5("Головоломки и монеты", hf.c0(new sd5("Максимум монет подсказок (999)", "Бесконечные Hint Coins", "020D8400 000003E7"), new sd5("Максимум Picarats (Очков)", "Всегда высшая оценка за разгадку", "020D8404 0000270F"))));
                                } else if (hf.c0("YDQE", "YDQJ").contains(upperCase)) {
                                    yt1Var = hf.b0(new td5("Персонажи и битвы", hf.c0(new sd5("Бесконечное HP отряда", "HP команды зафиксировано на максимуме", "020E5100 000003E7"), new sd5("Бесконечное MP", "Магия не заканчивается", "020E5104 000003E7"), new sd5("Максимум золота (9,999,999)", "Полный кошель золота", "020E5110 0098967F"))));
                                } else if (!S02.equals("YQT") && !hf.c0("YQTE", "YQTJ", "YQTP").contains(upperCase)) {
                                    if (!S02.equals("CLT") && !hf.c0("CLTE", "CLTJ", "CLTP").contains(upperCase)) {
                                        if (!S02.equals("ADM") && !hf.c0("ADME", "ADMJ", "ADMP").contains(upperCase)) {
                                            if (!S02.equals("AWL") && !hf.c0("AWLE", "AWLJ", "AWLP").contains(upperCase)) {
                                                if (!hf.c0("YAK", "AKW", "AK8").contains(S02) && !hf.c0("YAKE", "YAKJ", "YAKP").contains(upperCase)) {
                                                    if (!hf.c0("ASC", "VSN", "VSJ").contains(S02) && !hf.c0("ASCE", "ASCJ", "ASCP").contains(upperCase)) {
                                                        if (!S02.equals("AMH") && !hf.c0("AMHE", "AMHJ", "AMHP").contains(upperCase)) {
                                                            if (!S02.equals("BO5") && !hf.c0("BO5E", "BO5J", "BO5P").contains(upperCase)) {
                                                                if (!hf.c0("BEB", "INA").contains(S02) && !hf.c0("BEBE", "BEBJ", "BEBP").contains(upperCase)) {
                                                                    yt1Var = yt1Var4;
                                                                } else {
                                                                    yt1Var = hf.b0(new td5("Команда и энергия", hf.c0(new sd5("Бесконечное GP (Выносливость)", "Футболисты не устают", "02162120 000003E7"), new sd5("Бесконечное TP (Очки суперприемов)", "Любые спецприемы без затрат", "02162124 000003E7"), new sd5("Максимум очков Prestige / Бонусных очков", "Максимальный баланс", "02162130 0098967F"))));
                                                                }
                                                            } else {
                                                                yt1Var = hf.b0(new td5("Адепты и джинны", hf.c0(new sd5("Бесконечное HP отряда", "Все адепты бессмертны", "02179120 000003E7"), new sd5("Бесконечное PP (Псинергия)", "Очки псинергии зафиксированы", "02179124 000003E7"), new sd5("Максимум золота (9,999,999)", "Максимум монет", "02179130 0098967F"))));
                                                            }
                                                        } else {
                                                            yt1Var = hf.b0(new td5("Самус и оружие", hf.c0(new sd5("Бесконечная энергия (Energy Tanks)", "Самус бессмертна", "020DE110 000003E7"), new sd5("Бесконечные ракеты (Missiles)", "Ракеты не истощаются", "020DE120 000003E7"), new sd5("Бесконечные боеприпасы универсального оружия", "Максимум патронов", "020DE130 000003E7"))));
                                                        }
                                                    } else {
                                                        yt1Var = hf.b0(new td5("Соник и кольца", hf.c0(new sd5("Бесконечные кольца (999 Rings)", "Кольца не заканчиваются", "02159110 000003E7"), new sd5("Бесконечные жизни (99)", "99 жизней", "02159114 00000063"), new sd5("Постоянное ускорение (Infinite Boost)", "Шкала Boost всегда заполнена", "02159120 00000064"))));
                                                    }
                                                } else {
                                                    yt1Var = hf.b0(new td5("Кирби и жизни", hf.c0(new sd5("Бесконечное HP Кирби", "Кирби не теряет здоровье", "020F3120 00000050"), new sd5("Бесконечные жизни (99)", "99 жизней", "020F3124 00000063"), new sd5("Постоянный полет", "Неограниченное время парения", "020F3130 00000001"))));
                                                }
                                            } else {
                                                yt1Var = hf.b0(new td5("Нэку и значки", hf.c0(new sd5("Бесконечное HP Нэку", "Бессмертие в боях Сибуи", "02148110 0000270F"), new sd5("Максимум денег (9,999,999 Yen)", "Максимум йен", "02148120 0098967F"), new sd5("Быстрая перезарядка всех значков", "Значки готовы к атаке мгновенно", "02148130 00000000"))));
                                            }
                                        } else {
                                            yt1Var = hf.b0(new td5("Карманы и колокольчики", hf.c0(new sd5("Максимум колокольчиков (Bells 99,999)", "Нажмите L+R", "94000130 FCFF0000\n021D88FC 0001869F\nD2000000 00000000"), new sd5("Все золотые инструменты (Gold Tools)", "В сумке появляются все золотые инструменты", "021D8910 0000101F"), new sd5("Сорняки никогда не растут", "Идеальный город", "021D8940 00000000"))));
                                        }
                                    } else {
                                        yt1Var = hf.b0(new td5("Роксас и магия", hf.c0(new sd5("Бесконечное HP Роксаса", "Роксас не получает урона", "021C4510 000003E7"), new sd5("Максимум очков Munny (9,999,999)", "Максимум валюты", "021C4520 0098967F"), new sd5("Бесконечный Limit Break", "Постоянный режим Limit Break", "021C4530 000003E7"))));
                                    }
                                } else {
                                    yt1Var = hf.b0(new td5("Персонажи и золото", hf.c0(new sd5("Бесконечное HP (Кроно и отряд)", "Все персонажи бессмертны в бою", "0205D120 000003E7"), new sd5("Бесконечное MP", "Магические очки не убывают", "0205D124 00000063"), new sd5("Максимум золота (9,999,999G)", "Максимальное количество денег", "0205D130 0098967F"), new sd5("Опыт x16 после боя", "Мгновенное повышение уровня", "0205D140 00000010"))));
                                }
                            } else {
                                yt1Var = hf.b0(new td5("Бэтмен и способности", hf.c0(new sd5("Бесконечное здоровье (HP)", "Здоровье Бэтмена зафиксировано", "020F0124 00000064"), new sd5("Максимум очков улучшений", "999,999 очков для гаджетов", "020F0128 000F423F"), new sd5("Все бэтаранги и гаджеты открыты", "Полный арсенал Бэтмена", "020F0130 FFFFFFFF"))));
                            }
                            if (yt1Var.isEmpty()) {
                                String upperCase3 = qs6.S0(4, str3).toUpperCase(locale);
                                upperCase3.getClass();
                                if (upperCase3.length() >= 4 && !qs6.j0(upperCase3, "_", false)) {
                                    List<String> c0 = hf.c0(lb1.A("https://raw.githubusercontent.com/DeadSkullzJr/NDS-i-Cheat-Databases/main/Cheats/", upperCase3, ".txt"), lb1.A("https://raw.githubusercontent.com/DeadSkullzJr/NDS-i-Cheat-Databases/master/Cheats/", upperCase3, ".txt"));
                                    wk4 wk4Var = new wk4();
                                    wk4Var.a(5L);
                                    wk4Var.b(8L);
                                    xk4 xk4Var = new xk4(wk4Var);
                                    for (String str7 : c0) {
                                        try {
                                            s9 s9Var = new s9(13);
                                            s9Var.I(str7);
                                            s9Var.B("User-Agent", "STORM_DS_Cheats");
                                            try {
                                                wl5 e = new je5(xk4Var, new pa(s9Var), false).e();
                                                if (e.m0 && (yl5Var = e.Z) != null) {
                                                    ?? s = cs1.s(yl5Var.r());
                                                    if (!s.isEmpty()) {
                                                        yt1Var3 = s;
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable unused) {
                                                continue;
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                }
                                yt1Var3 = yt1Var4;
                                yt1Var2 = yt1Var3;
                            } else {
                                yt1Var2 = yt1Var;
                            }
                            if (yt1Var2.isEmpty()) {
                                return Boolean.FALSE;
                            }
                            MelonDatabase melonDatabase2 = (MelonDatabase) this.h0;
                            String str8 = (String) this.i0;
                            if (lp2Var3 != null) {
                                l2 = lp2Var3.a;
                            } else {
                                l2 = null;
                            }
                            this.Z = null;
                            this.d0 = null;
                            this.e0 = null;
                            this.Y = 4;
                            if (cs1.m(melonDatabase2, str3, str8, str6, yt1Var2, l2, this) == x61Var) {
                                return x61Var;
                            }
                            return Boolean.TRUE;
                        }
                    } else {
                        lp2Var3 = lp2Var2;
                    }
                    yt1Var = hf.c0(new td5("Основное и валюта", hf.c0(new sd5("Максимум денег (999,999$)", "Нажмите L+R для получения максимума денег", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n00000088 000F423F\nD2000000 00000000"), new sd5("Максимум очков BP (9,999)", "Нажмите L+R", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n10000090 0000270F\nD2000000 00000000"), new sd5("Быстрый бег / Speed Shoes", "Бег на B везде, включая здания", "E2000000 00000018\n78012101 22000000\n70014770 00000000\n020409A8 F800F7BF"))), new td5("Ловля и покемоны", hf.c0(new sd5("100% Шанс поимки покемона", "Любой Pokéball ловит покемона с 1-го раза", "92247612 00002801\n12247612 00004280\nD0000000 00000000"), new sd5("Покемоны всегда Shiny (Блестящие)", "Все дикие покемоны появляются в форме Shiny", "0206D0BC 47084900\n0206D0C0 02000001\nE2000000 00000020\n68004804 49042040\n47086840 00000000\n0206D0C5 00000000"), new sd5("Опыт x10 после битвы", "Увеличение получаемого опыта в 10 раз", "92244454 00000000\n02244454 0000000A\nD0000000 00000000"))));
                    if (yt1Var.isEmpty()) {
                    }
                    if (yt1Var2.isEmpty()) {
                    }
                } else {
                    str2 = (String) this.d0;
                    oi2.Y(obj);
                    str = (String) this.Z;
                    c = obj;
                    lp2Var2 = (lp2) c;
                    if (lp2Var2 == null && (l = lp2Var2.a) != null) {
                        bn0 u = melonDatabase.u();
                        long longValue = l.longValue();
                        this.Z = str;
                        this.d0 = str2;
                        this.e0 = lp2Var2;
                        this.Y = 3;
                        S = hv.S(this, u.a, true, false, new t4(6, longValue));
                        if (S != x61Var) {
                            str4 = str;
                            if (((List) S).isEmpty()) {
                            }
                        }
                        return x61Var;
                    }
                    str3 = str;
                    String S03 = qs6.S0(4, str3);
                    Locale locale2 = Locale.ROOT;
                    String upperCase4 = S03.toUpperCase(locale2);
                    upperCase4.getClass();
                    String S022 = qs6.S0(3, upperCase4);
                    String upperCase22 = str5.toUpperCase(locale2);
                    upperCase22.getClass();
                    contains = hf.c0("IPKE", "IPKJ", "IPKP", "IPKD", "IPKS", "IPKI").contains(upperCase4);
                    yt1 yt1Var42 = yt1.A;
                    String str62 = str2;
                    if (contains) {
                    }
                    yt1Var = hf.c0(new td5("Основное и валюта", hf.c0(new sd5("Максимум денег (999,999$)", "Нажмите L+R для получения максимума денег", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n00000088 000F423F\nD2000000 00000000"), new sd5("Максимум очков BP (9,999)", "Нажмите L+R", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n10000090 0000270F\nD2000000 00000000"), new sd5("Быстрый бег / Speed Shoes", "Бег на B везде, включая здания", "E2000000 00000018\n78012101 22000000\n70014770 00000000\n020409A8 F800F7BF"))), new td5("Ловля и покемоны", hf.c0(new sd5("100% Шанс поимки покемона", "Любой Pokéball ловит покемона с 1-го раза", "92247612 00002801\n12247612 00004280\nD0000000 00000000"), new sd5("Покемоны всегда Shiny (Блестящие)", "Все дикие покемоны появляются в форме Shiny", "0206D0BC 47084900\n0206D0C0 02000001\nE2000000 00000020\n68004804 49042040\n47086840 00000000\n0206D0C5 00000000"), new sd5("Опыт x10 после битвы", "Увеличение получаемого опыта в 10 раз", "92244454 00000000\n02244454 0000000A\nD0000000 00000000"))));
                    if (yt1Var.isEmpty()) {
                    }
                    if (yt1Var2.isEmpty()) {
                    }
                }
            } else {
                str2 = (String) this.d0;
                str = (String) this.Z;
                oi2.Y(obj);
                b = obj;
            }
        } else {
            oi2.Y(obj);
            String obj2 = qs6.T0((String) this.f0).toString();
            Locale locale3 = Locale.ROOT;
            String upperCase5 = obj2.toUpperCase(locale3);
            upperCase5.getClass();
            String upperCase6 = qs6.T0(str5).toString().toUpperCase(locale3);
            upperCase6.getClass();
            if (qs6.v0(upperCase5) && qs6.v0(upperCase6)) {
                return Boolean.FALSE;
            }
            if (!qs6.v0(upperCase6)) {
                ip2 v = melonDatabase.v();
                this.Z = upperCase5;
                this.d0 = upperCase6;
                this.Y = 1;
                b = v.b(upperCase6, this);
                if (b != x61Var) {
                    str = upperCase5;
                    str2 = upperCase6;
                }
                return x61Var;
            }
            str = upperCase5;
            str2 = upperCase6;
            lp2Var = null;
            if (lp2Var != null) {
                if (!qs6.v0(str)) {
                    ip2 v2 = melonDatabase.v();
                    this.Z = str;
                    this.d0 = str2;
                    this.Y = 2;
                    c = v2.c(str, this);
                } else {
                    lp2Var2 = null;
                }
            } else {
                lp2Var2 = lp2Var;
            }
            if (lp2Var2 == null) {
            }
            str3 = str;
            String S032 = qs6.S0(4, str3);
            Locale locale22 = Locale.ROOT;
            String upperCase42 = S032.toUpperCase(locale22);
            upperCase42.getClass();
            String S0222 = qs6.S0(3, upperCase42);
            String upperCase222 = str5.toUpperCase(locale22);
            upperCase222.getClass();
            contains = hf.c0("IPKE", "IPKJ", "IPKP", "IPKD", "IPKS", "IPKI").contains(upperCase42);
            yt1 yt1Var422 = yt1.A;
            String str622 = str2;
            if (contains) {
            }
            yt1Var = hf.c0(new td5("Основное и валюта", hf.c0(new sd5("Максимум денег (999,999$)", "Нажмите L+R для получения максимума денег", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n00000088 000F423F\nD2000000 00000000"), new sd5("Максимум очков BP (9,999)", "Нажмите L+R", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n10000090 0000270F\nD2000000 00000000"), new sd5("Быстрый бег / Speed Shoes", "Бег на B везде, включая здания", "E2000000 00000018\n78012101 22000000\n70014770 00000000\n020409A8 F800F7BF"))), new td5("Ловля и покемоны", hf.c0(new sd5("100% Шанс поимки покемона", "Любой Pokéball ловит покемона с 1-го раза", "92247612 00002801\n12247612 00004280\nD0000000 00000000"), new sd5("Покемоны всегда Shiny (Блестящие)", "Все дикие покемоны появляются в форме Shiny", "0206D0BC 47084900\n0206D0C0 02000001\nE2000000 00000020\n68004804 49042040\n47086840 00000000\n0206D0C5 00000000"), new sd5("Опыт x10 после битвы", "Увеличение получаемого опыта в 10 раз", "92244454 00000000\n02244454 0000000A\nD0000000 00000000"))));
            if (yt1Var.isEmpty()) {
            }
            if (yt1Var2.isEmpty()) {
            }
        }
        lp2Var = (lp2) b;
        if (lp2Var != null) {
        }
        if (lp2Var2 == null) {
        }
        str3 = str;
        String S0322 = qs6.S0(4, str3);
        Locale locale222 = Locale.ROOT;
        String upperCase422 = S0322.toUpperCase(locale222);
        upperCase422.getClass();
        String S02222 = qs6.S0(3, upperCase422);
        String upperCase2222 = str5.toUpperCase(locale222);
        upperCase2222.getClass();
        contains = hf.c0("IPKE", "IPKJ", "IPKP", "IPKD", "IPKS", "IPKI").contains(upperCase422);
        yt1 yt1Var4222 = yt1.A;
        String str6222 = str2;
        if (contains) {
        }
        yt1Var = hf.c0(new td5("Основное и валюта", hf.c0(new sd5("Максимум денег (999,999$)", "Нажмите L+R для получения максимума денег", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n00000088 000F423F\nD2000000 00000000"), new sd5("Максимум очков BP (9,999)", "Нажмите L+R", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n10000090 0000270F\nD2000000 00000000"), new sd5("Быстрый бег / Speed Shoes", "Бег на B везде, включая здания", "E2000000 00000018\n78012101 22000000\n70014770 00000000\n020409A8 F800F7BF"))), new td5("Ловля и покемоны", hf.c0(new sd5("100% Шанс поимки покемона", "Любой Pokéball ловит покемона с 1-го раза", "92247612 00002801\n12247612 00004280\nD0000000 00000000"), new sd5("Покемоны всегда Shiny (Блестящие)", "Все дикие покемоны появляются в форме Shiny", "0206D0BC 47084900\n0206D0C0 02000001\nE2000000 00000020\n68004804 49042040\n47086840 00000000\n0206D0C5 00000000"), new sd5("Опыт x10 после битвы", "Увеличение получаемого опыта в 10 раз", "92244454 00000000\n02244454 0000000A\nD0000000 00000000"))));
        if (yt1Var.isEmpty()) {
        }
        if (yt1Var2.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r10.e(r9) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #1 {all -> 0x00ca, blocks: (B:33:0x00b7, B:34:0x00b9, B:37:0x00c0, B:45:0x00d0, B:46:0x00d2, B:48:0x00d8, B:51:0x00df), top: B:59:0x000b }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [x61, fb4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object x(Object obj) {
        xa3 xa3Var;
        hb4 hb4Var;
        qn2 qn2Var;
        Throwable th;
        xa3 xa3Var2;
        fb4 fb4Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        ya3 ya3Var = (ya3) this.h0;
        ?? r1 = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ya3Var = (ya3) this.d0;
                            fb4Var = (fb4) this.Z;
                            xa3Var2 = (xa3) this.f0;
                            try {
                                oi2.Y(obj);
                                atomicReference2 = ya3Var.a;
                                while (!atomicReference2.compareAndSet(xa3Var2, null) && atomicReference2.get() == xa3Var2) {
                                }
                                fb4Var.h(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = ya3Var.a;
                                while (!atomicReference.compareAndSet(xa3Var2, null) && atomicReference.get() == xa3Var2) {
                                }
                                throw th;
                            }
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ya3Var = (ya3) this.e0;
                    xa3 xa3Var3 = (xa3) this.f0;
                    oi2.Y(obj);
                    qn2Var = (qn2) this.d0;
                    xa3Var = xa3Var3;
                    hb4Var = (fb4) this.Z;
                } else {
                    oi2.Y(obj);
                    j61 Z = ((w61) this.f0).A().Z(vs0.h0);
                    Z.getClass();
                    xa3Var = new xa3((xa4) this.g0, (rc3) Z);
                    AtomicReference atomicReference3 = ya3Var.a;
                    while (true) {
                        xa3 xa3Var4 = (xa3) atomicReference3.get();
                        if (xa3Var4 != null && xa3Var.a.compareTo(xa3Var4.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(xa3Var4, xa3Var)) {
                            if (atomicReference3.get() != xa3Var4) {
                                break;
                            }
                        }
                        if (xa3Var4 != null) {
                            xa3Var4.b.h(null);
                        }
                        hb4Var = ya3Var.b;
                        qn2Var = (qn2) this.i0;
                        this.f0 = xa3Var;
                        this.Z = hb4Var;
                        this.d0 = qn2Var;
                        this.e0 = ya3Var;
                        this.Y = 1;
                    }
                }
                this.f0 = xa3Var;
                this.Z = hb4Var;
                this.d0 = ya3Var;
                this.e0 = null;
                this.Y = 2;
                Object g = qn2Var.g(this);
                if (g != r1) {
                    fb4Var = hb4Var;
                    obj = g;
                    xa3Var2 = xa3Var;
                    atomicReference2 = ya3Var.a;
                    while (!atomicReference2.compareAndSet(xa3Var2, null)) {
                        while (!atomicReference2.compareAndSet(xa3Var2, null)) {
                        }
                    }
                    fb4Var.h(null);
                    return obj;
                }
                return r1;
            } catch (Throwable th3) {
                th = th3;
                xa3Var2 = xa3Var;
                atomicReference = ya3Var.a;
                while (!atomicReference.compareAndSet(xa3Var2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.h(null);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (r10.e(r9) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:33:0x00be, B:34:0x00c0, B:37:0x00c7, B:45:0x00d7, B:46:0x00d9, B:48:0x00df, B:51:0x00e6), top: B:57:0x000b }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [x61, fb4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object z(Object obj) {
        bb4 bb4Var;
        hb4 hb4Var;
        qn2 qn2Var;
        Throwable th;
        bb4 bb4Var2;
        fb4 fb4Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        eb4 eb4Var = (eb4) this.h0;
        ?? r1 = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            eb4Var = (eb4) this.d0;
                            fb4Var = (fb4) this.Z;
                            bb4Var2 = (bb4) this.f0;
                            try {
                                oi2.Y(obj);
                                atomicReference2 = eb4Var.a;
                                while (!atomicReference2.compareAndSet(bb4Var2, null) && atomicReference2.get() == bb4Var2) {
                                }
                                fb4Var.h(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                atomicReference = eb4Var.a;
                                while (!atomicReference.compareAndSet(bb4Var2, null) && atomicReference.get() == bb4Var2) {
                                }
                                throw th;
                            }
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eb4Var = (eb4) this.e0;
                    bb4 bb4Var3 = (bb4) this.f0;
                    oi2.Y(obj);
                    qn2Var = (qn2) this.d0;
                    bb4Var = bb4Var3;
                    hb4Var = (fb4) this.Z;
                } else {
                    oi2.Y(obj);
                    j61 Z = ((w61) this.f0).A().Z(vs0.h0);
                    Z.getClass();
                    bb4Var = new bb4((ya4) this.g0, (rc3) Z);
                    AtomicReference atomicReference3 = eb4Var.a;
                    while (true) {
                        bb4 bb4Var4 = (bb4) atomicReference3.get();
                        if (bb4Var4 != null && bb4Var.a.compareTo(bb4Var4.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(bb4Var4, bb4Var)) {
                            if (atomicReference3.get() != bb4Var4) {
                                break;
                            }
                        }
                        if (bb4Var4 != null) {
                            bb4Var4.b.h(new CancellationException("Mutation interrupted"));
                        }
                        hb4Var = eb4Var.b;
                        qn2Var = (qn2) this.i0;
                        this.f0 = bb4Var;
                        this.Z = hb4Var;
                        this.d0 = qn2Var;
                        this.e0 = eb4Var;
                        this.Y = 1;
                    }
                }
                this.f0 = bb4Var;
                this.Z = hb4Var;
                this.d0 = eb4Var;
                this.e0 = null;
                this.Y = 2;
                Object g = qn2Var.g(this);
                if (g != r1) {
                    fb4Var = hb4Var;
                    obj = g;
                    bb4Var2 = bb4Var;
                    atomicReference2 = eb4Var.a;
                    while (!atomicReference2.compareAndSet(bb4Var2, null)) {
                        while (!atomicReference2.compareAndSet(bb4Var2, null)) {
                        }
                    }
                    fb4Var.h(null);
                    return obj;
                }
                return r1;
            } catch (Throwable th3) {
                th = th3;
                bb4Var2 = bb4Var;
                atomicReference = eb4Var.a;
                while (!atomicReference.compareAndSet(bb4Var2, null)) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.h(null);
            throw th4;
        }
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 5:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 6:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 7:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 8:
                return ((ja1) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((ja1) q((r41) obj2, (ne2) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.i0;
        switch (i) {
            case 0:
                return new ja1((la1) obj2, r41Var);
            case 1:
                return new ja1((String) this.f0, (String) this.g0, (MelonDatabase) this.h0, (String) obj2, r41Var);
            case 2:
                return new ja1((sz1) this.h0, (yh2) obj2, r41Var);
            case 3:
                return new ja1((w42) this.Z, (dh5) this.d0, (dh5) this.e0, (z23) this.f0, this.g0, (dh5) this.h0, (k62) obj2, r41Var, 3);
            case 4:
                return new ja1((w42) this.Z, (z23) this.d0, this.e0, (fo4) this.f0, (k62) this.g0, (c44) this.h0, (re5) obj2, r41Var, 4);
            case 5:
                return new ja1((Context) this.Z, (String) this.d0, (pq5) this.e0, (String) this.f0, (String) this.g0, (Bitmap.CompressFormat) this.h0, (qa4) obj2, r41Var, 5);
            case 6:
                ja1 ja1Var = new ja1((xa4) this.g0, (ya3) this.h0, (qn2) obj2, r41Var, 6);
                ja1Var.f0 = obj;
                return ja1Var;
            case 7:
                ja1 ja1Var2 = new ja1((xa4) this.g0, (db4) this.h0, (qn2) obj2, r41Var, 7);
                ja1Var2.f0 = obj;
                return ja1Var2;
            case 8:
                ja1 ja1Var3 = new ja1((ya4) this.g0, (eb4) this.h0, (qn2) obj2, r41Var, 8);
                ja1Var3.f0 = obj;
                return ja1Var3;
            default:
                ja1 ja1Var4 = new ja1((ContentResolver) this.e0, (Uri) this.f0, (x71) this.g0, (v80) this.h0, (Context) obj2, r41Var);
                ja1Var4.d0 = obj;
                return ja1Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x024d, code lost:
        if (defpackage.hv.d0(r0, r14, r21) == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0267, code lost:
        if (defpackage.hv.d0(r3, r6, r21) != r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x049a, code lost:
        if (r0 == r14) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04cb, code lost:
        if (r0 == r14) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04f6, code lost:
        if (r2 == r14) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x051d, code lost:
        if (r0 == r14) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05c7, code lost:
        if (r0 == r6) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0608, code lost:
        if (defpackage.sz1.I(r15, r1, r21) == r6) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x061d, code lost:
        if (r15.l0(r21) == r6) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x06b3, code lost:
        if (r11 == r9) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08a1, code lost:
        if (r2.c(r7, r21) == r9) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x08bb, code lost:
        if (r0 == r9) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x08d2, code lost:
        if (defpackage.hv.d0(r2, r3, r21) == r9) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x08e6, code lost:
        if (defpackage.hv.d0(r2, r4, r21) == r9) goto L289;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #3 {all -> 0x0033, blocks: (B:9:0x002d, B:19:0x0064, B:23:0x0076, B:25:0x007e, B:15:0x0046, B:18:0x005b), top: B:376:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06e2 A[Catch: all -> 0x08a7, TryCatch #5 {all -> 0x08a7, blocks: (B:290:0x066d, B:342:0x0812, B:344:0x0818, B:346:0x0860, B:348:0x086a, B:350:0x0873, B:353:0x087b, B:355:0x0881, B:358:0x0888, B:293:0x068c, B:334:0x07c6, B:336:0x07cc, B:338:0x07eb, B:341:0x080e, B:296:0x0696, B:323:0x0713, B:324:0x0724, B:326:0x072a, B:327:0x0749, B:329:0x075f, B:330:0x077e, B:332:0x0794, B:333:0x07ba, B:297:0x069e, B:308:0x06d1, B:309:0x06dc, B:311:0x06e2, B:313:0x06ed, B:315:0x06f5, B:317:0x06fd, B:319:0x0703, B:320:0x0707, B:305:0x06bf), top: B:379:0x063f }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x072a A[Catch: all -> 0x08a7, LOOP:1: B:324:0x0724->B:326:0x072a, LOOP_END, TryCatch #5 {all -> 0x08a7, blocks: (B:290:0x066d, B:342:0x0812, B:344:0x0818, B:346:0x0860, B:348:0x086a, B:350:0x0873, B:353:0x087b, B:355:0x0881, B:358:0x0888, B:293:0x068c, B:334:0x07c6, B:336:0x07cc, B:338:0x07eb, B:341:0x080e, B:296:0x0696, B:323:0x0713, B:324:0x0724, B:326:0x072a, B:327:0x0749, B:329:0x075f, B:330:0x077e, B:332:0x0794, B:333:0x07ba, B:297:0x069e, B:308:0x06d1, B:309:0x06dc, B:311:0x06e2, B:313:0x06ed, B:315:0x06f5, B:317:0x06fd, B:319:0x0703, B:320:0x0707, B:305:0x06bf), top: B:379:0x063f }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x075f A[Catch: all -> 0x08a7, LOOP:2: B:328:0x075d->B:329:0x075f, LOOP_END, TryCatch #5 {all -> 0x08a7, blocks: (B:290:0x066d, B:342:0x0812, B:344:0x0818, B:346:0x0860, B:348:0x086a, B:350:0x0873, B:353:0x087b, B:355:0x0881, B:358:0x0888, B:293:0x068c, B:334:0x07c6, B:336:0x07cc, B:338:0x07eb, B:341:0x080e, B:296:0x0696, B:323:0x0713, B:324:0x0724, B:326:0x072a, B:327:0x0749, B:329:0x075f, B:330:0x077e, B:332:0x0794, B:333:0x07ba, B:297:0x069e, B:308:0x06d1, B:309:0x06dc, B:311:0x06e2, B:313:0x06ed, B:315:0x06f5, B:317:0x06fd, B:319:0x0703, B:320:0x0707, B:305:0x06bf), top: B:379:0x063f }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0794 A[Catch: all -> 0x08a7, LOOP:3: B:331:0x0792->B:332:0x0794, LOOP_END, TryCatch #5 {all -> 0x08a7, blocks: (B:290:0x066d, B:342:0x0812, B:344:0x0818, B:346:0x0860, B:348:0x086a, B:350:0x0873, B:353:0x087b, B:355:0x0881, B:358:0x0888, B:293:0x068c, B:334:0x07c6, B:336:0x07cc, B:338:0x07eb, B:341:0x080e, B:296:0x0696, B:323:0x0713, B:324:0x0724, B:326:0x072a, B:327:0x0749, B:329:0x075f, B:330:0x077e, B:332:0x0794, B:333:0x07ba, B:297:0x069e, B:308:0x06d1, B:309:0x06dc, B:311:0x06e2, B:313:0x06ed, B:315:0x06f5, B:317:0x06fd, B:319:0x0703, B:320:0x0707, B:305:0x06bf), top: B:379:0x063f }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07cc A[Catch: all -> 0x08a7, TryCatch #5 {all -> 0x08a7, blocks: (B:290:0x066d, B:342:0x0812, B:344:0x0818, B:346:0x0860, B:348:0x086a, B:350:0x0873, B:353:0x087b, B:355:0x0881, B:358:0x0888, B:293:0x068c, B:334:0x07c6, B:336:0x07cc, B:338:0x07eb, B:341:0x080e, B:296:0x0696, B:323:0x0713, B:324:0x0724, B:326:0x072a, B:327:0x0749, B:329:0x075f, B:330:0x077e, B:332:0x0794, B:333:0x07ba, B:297:0x069e, B:308:0x06d1, B:309:0x06dc, B:311:0x06e2, B:313:0x06ed, B:315:0x06f5, B:317:0x06fd, B:319:0x0703, B:320:0x0707, B:305:0x06bf), top: B:379:0x063f }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0818 A[Catch: all -> 0x08a7, TryCatch #5 {all -> 0x08a7, blocks: (B:290:0x066d, B:342:0x0812, B:344:0x0818, B:346:0x0860, B:348:0x086a, B:350:0x0873, B:353:0x087b, B:355:0x0881, B:358:0x0888, B:293:0x068c, B:334:0x07c6, B:336:0x07cc, B:338:0x07eb, B:341:0x080e, B:296:0x0696, B:323:0x0713, B:324:0x0724, B:326:0x072a, B:327:0x0749, B:329:0x075f, B:330:0x077e, B:332:0x0794, B:333:0x07ba, B:297:0x069e, B:308:0x06d1, B:309:0x06dc, B:311:0x06e2, B:313:0x06ed, B:315:0x06f5, B:317:0x06fd, B:319:0x0703, B:320:0x0707, B:305:0x06bf), top: B:379:0x063f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:19:0x0064). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:351:0x0877 -> B:361:0x08a4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:354:0x087f -> B:361:0x08a4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:357:0x0887 -> B:361:0x08a4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:359:0x08a1 -> B:361:0x08a4). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        r41 r41Var;
        Serializable h;
        Serializable i;
        Object B;
        ArrayList arrayList;
        Serializable h2;
        String path;
        int size;
        int i2;
        Set p1;
        int size2;
        int i3;
        List list;
        Iterator it;
        Set set;
        Set set2;
        Iterator it2;
        String str;
        String obj2;
        dy1 dy1Var;
        mc5 mc5Var;
        Object obj3;
        x61 x61Var;
        Object P0;
        mc5 mc5Var2;
        dy1 dy1Var2;
        int i4;
        Object C;
        de5 de5Var;
        bv4 bv4Var;
        Object b;
        dy1 dy1Var3;
        mc5 mc5Var3;
        jb5 jb5Var;
        String str2;
        Object d0;
        mc5 mc5Var4;
        String str3;
        Object f;
        String str4;
        pj4 pj4Var;
        mc5 mc5Var5;
        Object A;
        dy1 dy1Var4;
        Object b2;
        se5 se5Var;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        boolean z;
        re5 re5Var;
        boolean z2;
        r41 r41Var2;
        Object d02;
        bu6 bu6Var;
        Drawable drawable;
        BitmapDrawable bitmapDrawable2;
        Bitmap bitmap2;
        OutputStream fileOutputStream;
        ne2 ne2Var;
        n80 n80Var;
        ne2 ne2Var2;
        Object obj4;
        n80 n80Var2;
        switch (this.X) {
            case 0:
                la1 la1Var = (la1) this.i0;
                fg fgVar = la1Var.b;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                switch (this.Y) {
                    case 0:
                        oi2.Y(obj);
                        this.Y = 1;
                        i = fgVar.i(this);
                        break;
                    case 1:
                        oi2.Y(obj);
                        i = obj;
                        if (((mm4) i).isSuccess()) {
                            g21 o = ((xb2) la1Var.f).o();
                            this.Y = 2;
                            B = f04.B(o, this);
                            if (B == x61Var2) {
                            }
                            arrayList = new ArrayList();
                            for (Object obj5 : (List) B) {
                                pq5 pq5Var = (pq5) obj5;
                                if (pq5Var.h || xs6.Y(pq5Var.c, ".dsi", true) || ((path = pq5Var.d.getPath()) != null && xs6.Y(path, ".dsi", true))) {
                                    arrayList.add(obj5);
                                }
                            }
                            this.Z = arrayList;
                            this.Y = 3;
                            h2 = fgVar.h(this);
                            if (h2 == x61Var2) {
                            }
                            List<DSiWareTitle> list2 = (List) h2;
                            ArrayList arrayList2 = new ArrayList(ht0.v0(list2, 10));
                            for (DSiWareTitle dSiWareTitle : list2) {
                                String lowerCase = qs6.T0(dSiWareTitle.getName()).toString().toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                arrayList2.add(lowerCase);
                            }
                            Set p12 = gt0.p1(arrayList2);
                            ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList, 10));
                            size = arrayList.size();
                            i2 = 0;
                            while (i2 < size) {
                                Object obj6 = arrayList.get(i2);
                                i2++;
                                String lowerCase2 = qs6.T0(((pq5) obj6).a).toString().toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                arrayList3.add(lowerCase2);
                            }
                            p1 = gt0.p1(arrayList3);
                            ArrayList arrayList4 = new ArrayList(ht0.v0(arrayList, 10));
                            size2 = arrayList.size();
                            i3 = 0;
                            while (i3 < size2) {
                                Object obj7 = arrayList.get(i3);
                                i3++;
                                String str5 = ((pq5) obj7).c;
                                String lowerCase3 = qs6.T0(qs6.R0('.', str5, str5)).toString().toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                arrayList4.add(lowerCase3);
                            }
                            Set p13 = gt0.p1(arrayList4);
                            list = list2;
                            it = arrayList.iterator();
                            set = p12;
                            set2 = p13;
                            while (it.hasNext()) {
                                pq5 pq5Var2 = (pq5) it.next();
                                String lowerCase4 = qs6.T0(pq5Var2.a).toString().toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                if (!set.contains(lowerCase4)) {
                                    Uri uri = pq5Var2.d;
                                    this.Z = null;
                                    this.d0 = list;
                                    this.e0 = set;
                                    this.f0 = p1;
                                    this.g0 = set2;
                                    this.h0 = it;
                                    this.Y = 4;
                                    if (fgVar.f(uri, this) == x61Var2) {
                                    }
                                }
                            }
                            it2 = list.iterator();
                            if (it2.hasNext()) {
                                DSiWareTitle dSiWareTitle2 = (DSiWareTitle) it2.next();
                                String obj8 = qs6.T0(dSiWareTitle2.getName()).toString();
                                Locale locale = Locale.ROOT;
                                String lowerCase5 = obj8.toLowerCase(locale);
                                lowerCase5.getClass();
                                db1 db1Var = la1Var.e;
                                long titleId = dSiWareTitle2.getTitleId();
                                db1Var.getClass();
                                g04.y(16);
                                String l = Long.toString(titleId & 4294967295L, 16);
                                l.getClass();
                                String lowerCase6 = qs6.B0(8, l).toLowerCase(locale);
                                lowerCase6.getClass();
                                String b3 = db1Var.b(lowerCase6);
                                if (b3 != null && (obj2 = qs6.T0(b3).toString()) != null) {
                                    str = obj2.toLowerCase(locale);
                                    str.getClass();
                                } else {
                                    str = null;
                                }
                                if (!p1.contains(lowerCase5) && ((str == null || !set2.contains(str)) && !set2.contains(lowerCase5))) {
                                    this.Z = null;
                                    this.d0 = null;
                                    this.e0 = null;
                                    this.f0 = p1;
                                    this.g0 = set2;
                                    this.h0 = it2;
                                    this.Y = 5;
                                    break;
                                }
                                if (it2.hasNext()) {
                                }
                            }
                            r41Var = null;
                            this.Z = null;
                            this.d0 = null;
                            this.e0 = null;
                            this.f0 = null;
                            this.g0 = null;
                            this.h0 = null;
                            this.Y = 6;
                            h = fgVar.h(this);
                            break;
                        } else {
                            xe1 xe1Var = xk1.a;
                            jv2 jv2Var = e04.a;
                            y3 y3Var = new y3(la1Var, (r41) null, 7);
                            this.Y = 8;
                            break;
                        }
                        return x61Var2;
                    case 2:
                        oi2.Y(obj);
                        B = obj;
                        arrayList = new ArrayList();
                        while (r10.hasNext()) {
                        }
                        this.Z = arrayList;
                        this.Y = 3;
                        h2 = fgVar.h(this);
                        if (h2 == x61Var2) {
                        }
                        List<DSiWareTitle> list22 = (List) h2;
                        ArrayList arrayList22 = new ArrayList(ht0.v0(list22, 10));
                        while (r10.hasNext()) {
                        }
                        Set p122 = gt0.p1(arrayList22);
                        ArrayList arrayList32 = new ArrayList(ht0.v0(arrayList, 10));
                        size = arrayList.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                        p1 = gt0.p1(arrayList32);
                        ArrayList arrayList42 = new ArrayList(ht0.v0(arrayList, 10));
                        size2 = arrayList.size();
                        i3 = 0;
                        while (i3 < size2) {
                        }
                        Set p132 = gt0.p1(arrayList42);
                        list = list22;
                        it = arrayList.iterator();
                        set = p122;
                        set2 = p132;
                        while (it.hasNext()) {
                        }
                        it2 = list.iterator();
                        if (it2.hasNext()) {
                        }
                        r41Var = null;
                        this.Z = null;
                        this.d0 = null;
                        this.e0 = null;
                        this.f0 = null;
                        this.g0 = null;
                        this.h0 = null;
                        this.Y = 6;
                        h = fgVar.h(this);
                        break;
                    case 3:
                        ArrayList arrayList5 = (ArrayList) this.Z;
                        oi2.Y(obj);
                        arrayList = arrayList5;
                        h2 = obj;
                        List<DSiWareTitle> list222 = (List) h2;
                        ArrayList arrayList222 = new ArrayList(ht0.v0(list222, 10));
                        while (r10.hasNext()) {
                        }
                        Set p1222 = gt0.p1(arrayList222);
                        ArrayList arrayList322 = new ArrayList(ht0.v0(arrayList, 10));
                        size = arrayList.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                        p1 = gt0.p1(arrayList322);
                        ArrayList arrayList422 = new ArrayList(ht0.v0(arrayList, 10));
                        size2 = arrayList.size();
                        i3 = 0;
                        while (i3 < size2) {
                        }
                        Set p1322 = gt0.p1(arrayList422);
                        list = list222;
                        it = arrayList.iterator();
                        set = p1222;
                        set2 = p1322;
                        while (it.hasNext()) {
                        }
                        it2 = list.iterator();
                        if (it2.hasNext()) {
                        }
                        r41Var = null;
                        this.Z = null;
                        this.d0 = null;
                        this.e0 = null;
                        this.f0 = null;
                        this.g0 = null;
                        this.h0 = null;
                        this.Y = 6;
                        h = fgVar.h(this);
                        break;
                    case 4:
                        it = (Iterator) this.h0;
                        set2 = (Set) this.g0;
                        p1 = (Set) this.f0;
                        set = (Set) this.e0;
                        list = (List) this.d0;
                        oi2.Y(obj);
                        while (it.hasNext()) {
                        }
                        it2 = list.iterator();
                        if (it2.hasNext()) {
                        }
                        r41Var = null;
                        this.Z = null;
                        this.d0 = null;
                        this.e0 = null;
                        this.f0 = null;
                        this.g0 = null;
                        this.h0 = null;
                        this.Y = 6;
                        h = fgVar.h(this);
                        break;
                    case 5:
                        it2 = (Iterator) this.h0;
                        set2 = (Set) this.g0;
                        p1 = (Set) this.f0;
                        Set set3 = (Set) this.e0;
                        oi2.Y(obj);
                        if (it2.hasNext()) {
                        }
                        r41Var = null;
                        this.Z = null;
                        this.d0 = null;
                        this.e0 = null;
                        this.f0 = null;
                        this.g0 = null;
                        this.h0 = null;
                        this.Y = 6;
                        h = fgVar.h(this);
                        break;
                    case 6:
                        oi2.Y(obj);
                        h = obj;
                        r41Var = null;
                        xe1 xe1Var2 = xk1.a;
                        jv2 jv2Var2 = e04.a;
                        m5 m5Var = new m5((Object) la1Var, (List) h, r41Var, 9);
                        this.Y = 7;
                        break;
                    case 7:
                    case 8:
                        oi2.Y(obj);
                        return jg7.a;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 1:
                return v(obj);
            case 2:
                jg7 jg7Var = jg7.a;
                sz1 sz1Var = (sz1) this.h0;
                of6 of6Var = sz1Var.J0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                switch (this.Y) {
                    case 0:
                        oi2.Y(obj);
                        Object value = sz1Var.p0.getValue();
                        if (value instanceof dy1) {
                            dy1Var = (dy1) value;
                        } else {
                            dy1Var = null;
                        }
                        mc5Var = mc5.RESUMABLE_SESSION;
                        s35 s35Var = sz1Var.V;
                        s35Var.getClass();
                        mc5Var.getClass();
                        if (((AtomicBoolean) s35Var.A).get()) {
                            mc5Var = mc5.TERMINAL_STOP;
                        }
                        if (dy1Var != null) {
                            jh jhVar = sz1Var.v;
                            this.Z = dy1Var;
                            this.d0 = mc5Var;
                            this.Y = 1;
                            jhVar.getClass();
                            jh.i();
                            break;
                        } else {
                            obj3 = null;
                            x61Var = x61Var3;
                            if (dy1Var != null) {
                                pq5 pq5Var3 = dy1Var.a;
                                this.Z = obj3;
                                this.d0 = obj3;
                                this.e0 = obj3;
                                this.f0 = obj3;
                                this.g0 = obj3;
                                this.Y = 11;
                                break;
                            }
                            this.Z = obj3;
                            this.d0 = obj3;
                            this.e0 = obj3;
                            this.f0 = obj3;
                            this.g0 = obj3;
                            this.Y = 12;
                            break;
                        }
                    case 1:
                        mc5Var = (mc5) this.d0;
                        dy1Var = (dy1) this.Z;
                        oi2.Y(obj);
                        this.Z = dy1Var;
                        this.d0 = mc5Var;
                        this.Y = 2;
                        P0 = sz1Var.P0(this);
                        if (P0 != x61Var3) {
                            dy1 dy1Var5 = dy1Var;
                            mc5Var2 = mc5Var;
                            dy1Var2 = dy1Var5;
                            if (((Boolean) P0).booleanValue()) {
                                of6Var.k(g77.a);
                                if (mc5Var2 == mc5.RESUMABLE_SESSION) {
                                    this.Z = null;
                                    this.d0 = null;
                                    this.Y = 3;
                                    sz1Var.U0();
                                    break;
                                }
                                return jg7Var;
                            }
                            nv4 nv4Var = sz1Var.b0;
                            if (nv4Var != null && (de5Var = nv4Var.i) != null && (bv4Var = (bv4) de5Var.A.getValue()) != null) {
                                i4 = bv4Var.c.a;
                            } else {
                                i4 = 0;
                            }
                            if (i4 > 0) {
                                this.Z = dy1Var2;
                                this.d0 = mc5Var2;
                                this.Y = 4;
                                C = sz1.C(sz1Var, mc5Var2, this);
                                break;
                            }
                            pn5 pn5Var = sz1Var.g;
                            this.Z = dy1Var2;
                            this.d0 = mc5Var2;
                            this.Y = 6;
                            b = ((pl) pn5Var).c.b(this);
                            if (b != x61Var3) {
                                dy1Var3 = dy1Var2;
                                mc5Var3 = mc5Var2;
                                jb5Var = (jb5) b;
                                if (jb5Var == null) {
                                    String a = jb5Var.a();
                                    String str6 = dy1Var3.a.i;
                                    xe1 xe1Var3 = xk1.a;
                                    de1 de1Var = de1.L;
                                    x61Var = x61Var3;
                                    i02 i02Var = new i02(sz1Var, a, str6, null, 4);
                                    str2 = a;
                                    obj3 = null;
                                    this.Z = dy1Var3;
                                    this.d0 = mc5Var3;
                                    this.e0 = str2;
                                    this.f0 = str6;
                                    this.Y = 7;
                                    d0 = hv.d0(de1Var, i02Var, this);
                                    if (d0 != x61Var) {
                                        mc5Var4 = mc5Var3;
                                        str3 = str6;
                                        pj4 pj4Var2 = (pj4) d0;
                                        iw2 iw2Var = sz1Var.o0;
                                        this.Z = dy1Var3;
                                        this.d0 = mc5Var4;
                                        this.e0 = str2;
                                        this.f0 = str3;
                                        this.g0 = pj4Var2;
                                        this.Y = 8;
                                        f = iw2Var.f(this);
                                        if (f != x61Var) {
                                            mc5 mc5Var6 = mc5Var4;
                                            str4 = str2;
                                            pj4Var = pj4Var2;
                                            mc5Var5 = mc5Var6;
                                            if (((Number) f).intValue() <= 0) {
                                                this.Z = dy1Var3;
                                                this.d0 = mc5Var5;
                                                this.e0 = obj3;
                                                this.f0 = obj3;
                                                this.g0 = obj3;
                                                this.Y = 9;
                                                A = sz1.A(sz1Var, str4, str3, mc5Var5, this);
                                                if (A != x61Var) {
                                                    dy1Var4 = dy1Var3;
                                                    if (((Boolean) A).booleanValue()) {
                                                        if (mc5Var5 == mc5.RESUMABLE_SESSION) {
                                                            this.Z = obj3;
                                                            this.d0 = obj3;
                                                            this.e0 = obj3;
                                                            this.f0 = obj3;
                                                            this.g0 = obj3;
                                                            this.Y = 10;
                                                            sz1Var.U0();
                                                            break;
                                                        }
                                                        return jg7Var;
                                                    }
                                                    dy1Var = dy1Var4;
                                                    if (dy1Var != null) {
                                                    }
                                                    this.Z = obj3;
                                                    this.d0 = obj3;
                                                    this.e0 = obj3;
                                                    this.f0 = obj3;
                                                    this.g0 = obj3;
                                                    this.Y = 12;
                                                    break;
                                                }
                                            } else {
                                                if (pj4Var.a == ui4.OK) {
                                                    sz1Var.m.b(str4, str3);
                                                    if (pj4Var.b() > 0) {
                                                        of6Var.k(new f77(pj4Var.b(), pj4Var.e));
                                                    }
                                                }
                                                dy1Var = dy1Var3;
                                                if (dy1Var != null) {
                                                }
                                                this.Z = obj3;
                                                this.d0 = obj3;
                                                this.e0 = obj3;
                                                this.f0 = obj3;
                                                this.g0 = obj3;
                                                this.Y = 12;
                                            }
                                        }
                                    }
                                    return x61Var;
                                }
                                obj3 = null;
                                x61Var = x61Var3;
                                dy1Var = dy1Var3;
                                if (dy1Var != null) {
                                }
                                this.Z = obj3;
                                this.d0 = obj3;
                                this.e0 = obj3;
                                this.f0 = obj3;
                                this.g0 = obj3;
                                this.Y = 12;
                            }
                        }
                        x61Var = x61Var3;
                        return x61Var;
                    case 2:
                        dy1 dy1Var6 = (dy1) this.Z;
                        oi2.Y(obj);
                        mc5Var2 = (mc5) this.d0;
                        dy1Var2 = dy1Var6;
                        P0 = obj;
                        if (((Boolean) P0).booleanValue()) {
                        }
                        x61Var = x61Var3;
                        return x61Var;
                    case 3:
                    case 5:
                    case 10:
                        oi2.Y(obj);
                        return jg7Var;
                    case 4:
                        mc5Var2 = (mc5) this.d0;
                        dy1Var2 = (dy1) this.Z;
                        oi2.Y(obj);
                        C = obj;
                        int i5 = w22.a[((nc5) C).ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    i.d();
                                    return null;
                                }
                            } else if (mc5Var2 == mc5.RESUMABLE_SESSION) {
                                this.Z = null;
                                this.d0 = null;
                                this.Y = 5;
                                sz1Var.U0();
                                break;
                            }
                            return jg7Var;
                        }
                        pn5 pn5Var2 = sz1Var.g;
                        this.Z = dy1Var2;
                        this.d0 = mc5Var2;
                        this.Y = 6;
                        b = ((pl) pn5Var2).c.b(this);
                        if (b != x61Var3) {
                        }
                        x61Var = x61Var3;
                        return x61Var;
                    case 6:
                        mc5Var3 = (mc5) this.d0;
                        oi2.Y(obj);
                        b = obj;
                        dy1Var3 = (dy1) this.Z;
                        jb5Var = (jb5) b;
                        if (jb5Var == null) {
                        }
                        break;
                    case 7:
                        str3 = (String) this.f0;
                        mc5Var4 = (mc5) this.d0;
                        dy1Var3 = (dy1) this.Z;
                        oi2.Y(obj);
                        d0 = obj;
                        str2 = (String) this.e0;
                        obj3 = null;
                        x61Var = x61Var3;
                        pj4 pj4Var22 = (pj4) d0;
                        iw2 iw2Var2 = sz1Var.o0;
                        this.Z = dy1Var3;
                        this.d0 = mc5Var4;
                        this.e0 = str2;
                        this.f0 = str3;
                        this.g0 = pj4Var22;
                        this.Y = 8;
                        f = iw2Var2.f(this);
                        if (f != x61Var) {
                        }
                        return x61Var;
                    case 8:
                        str3 = (String) this.f0;
                        dy1Var3 = (dy1) this.Z;
                        oi2.Y(obj);
                        pj4Var = (pj4) this.g0;
                        mc5Var5 = (mc5) this.d0;
                        obj3 = null;
                        f = obj;
                        str4 = (String) this.e0;
                        x61Var = x61Var3;
                        if (((Number) f).intValue() <= 0) {
                        }
                        break;
                    case 9:
                        mc5Var5 = (mc5) this.d0;
                        dy1Var4 = (dy1) this.Z;
                        oi2.Y(obj);
                        A = obj;
                        obj3 = null;
                        x61Var = x61Var3;
                        if (((Boolean) A).booleanValue()) {
                        }
                        break;
                    case 11:
                        oi2.Y(obj);
                        obj3 = null;
                        x61Var = x61Var3;
                        this.Z = obj3;
                        this.d0 = obj3;
                        this.e0 = obj3;
                        this.f0 = obj3;
                        this.g0 = obj3;
                        this.Y = 12;
                        break;
                    case 12:
                        oi2.Y(obj);
                        sz1Var.a1();
                        sz1Var.x0((yh2) this.i0);
                        return jg7Var;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object a2 = w42.a((w42) this.Z, (mn6) ((dh5) this.d0).A, (uv0) ((dh5) this.e0).A, (z23) this.f0, this.g0, (fo4) ((dh5) this.h0).A, (k62) this.i0, this);
                if (a2 == x61Var4) {
                    return x61Var4;
                }
                return a2;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        b2 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    b2 = w42.b((w42) this.Z, (z23) this.d0, this.e0, (fo4) this.f0, (k62) this.g0, this);
                    if (b2 == x61Var5) {
                        return x61Var5;
                    }
                }
                q42 q42Var = (q42) b2;
                jx6 jx6Var = ((w42) this.Z).b;
                synchronized (jx6Var) {
                    try {
                        pe5 pe5Var = (pe5) jx6Var.A.get();
                        if (pe5Var != null) {
                            if (jx6Var.B == null) {
                                Context context = pe5Var.a;
                                jx6Var.B = context;
                                context.registerComponentCallbacks(jx6Var);
                            }
                        } else {
                            jx6Var.b();
                        }
                    } finally {
                    }
                }
                s63 s63Var = ((w42) this.Z).d;
                c44 c44Var = (c44) this.h0;
                if (((z23) this.d0).p.getWriteEnabled() && (se5Var = (se5) ((pe5) s63Var.B).c.getValue()) != null && c44Var != null) {
                    Drawable drawable2 = q42Var.a;
                    if (drawable2 instanceof BitmapDrawable) {
                        bitmapDrawable = (BitmapDrawable) drawable2;
                    } else {
                        bitmapDrawable = null;
                    }
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(q42Var.b));
                        String str7 = q42Var.d;
                        if (str7 != null) {
                            linkedHashMap.put("coil#disk_cache_key", str7);
                        }
                        se5Var.a.h(new c44(c44Var.A, g04.V(c44Var.B)), bitmap, g04.V(linkedHashMap));
                        z = true;
                        Drawable drawable3 = q42Var.a;
                        z23 z23Var = (z23) this.d0;
                        zb1 zb1Var = q42Var.c;
                        c44 c44Var2 = (c44) this.h0;
                        if (!z) {
                            c44Var2 = null;
                        }
                        String str8 = q42Var.d;
                        boolean z3 = q42Var.b;
                        re5Var = (re5) this.i0;
                        Bitmap.Config[] configArr = k.a;
                        if (re5Var == null && re5Var.A) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return new bu6(drawable3, z23Var, zb1Var, c44Var2, str8, z3, z2);
                    }
                }
                z = false;
                Drawable drawable32 = q42Var.a;
                z23 z23Var2 = (z23) this.d0;
                zb1 zb1Var2 = q42Var.c;
                c44 c44Var22 = (c44) this.h0;
                if (!z) {
                }
                String str82 = q42Var.d;
                boolean z32 = q42Var.b;
                re5Var = (re5) this.i0;
                Bitmap.Config[] configArr2 = k.a;
                if (re5Var == null) {
                }
                z2 = false;
                return new bu6(drawable32, z23Var2, zb1Var2, c44Var22, str82, z32, z2);
            case 5:
                jg7 jg7Var2 = jg7.a;
                pq5 pq5Var4 = (pq5) this.e0;
                Context context2 = (Context) this.Z;
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                try {
                } catch (Throwable th) {
                    th = th;
                    r41Var2 = null;
                }
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2 && i8 != 3) {
                            if (i8 == 4) {
                                oi2.Y(obj);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj);
                        }
                        return jg7Var2;
                    }
                    oi2.Y(obj);
                    d02 = obj;
                } else {
                    oi2.Y(obj);
                    pe5 g = new pa(context2).g();
                    x23 x23Var = new x23(context2);
                    Object obj9 = (String) this.d0;
                    if (obj9 == null) {
                        obj9 = hf.m0(context2, pq5Var4);
                    }
                    x23Var.c = obj9;
                    x23Var.m = Boolean.FALSE;
                    z23 a3 = x23Var.a();
                    this.Y = 1;
                    xe1 xe1Var4 = xk1.a;
                    d02 = hv.d0(e04.a.Y, new ne5(g, a3, null, 1), this);
                    if (d02 == x61Var6) {
                        return x61Var6;
                    }
                }
                if (d02 instanceof bu6) {
                    bu6Var = (bu6) d02;
                } else {
                    bu6Var = null;
                }
                if (bu6Var != null) {
                    drawable = bu6Var.a;
                } else {
                    drawable = null;
                }
                if (drawable instanceof BitmapDrawable) {
                    bitmapDrawable2 = (BitmapDrawable) drawable;
                } else {
                    bitmapDrawable2 = null;
                }
                if (bitmapDrawable2 != null) {
                    bitmap2 = bitmapDrawable2.getBitmap();
                } else {
                    bitmap2 = null;
                }
                if (bitmap2 == null) {
                    xe1 xe1Var5 = xk1.a;
                    jv2 jv2Var3 = e04.a;
                    jn2 jn2Var = new jn2(context2, null, 0);
                    this.Y = 2;
                    if (hv.d0(jv2Var3, jn2Var, this) == x61Var6) {
                        return x61Var6;
                    }
                    return jg7Var2;
                }
                String k0 = hf.k0(pq5Var4);
                Pattern compile = Pattern.compile("[^a-zA-Z0-9_-]");
                compile.getClass();
                k0.getClass();
                String replaceAll = compile.matcher(k0).replaceAll("_");
                replaceAll.getClass();
                String str9 = "STORM_" + replaceAll + "_cover." + ((String) this.f0);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str9);
                    contentValues.put("mime_type", (String) this.g0);
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/STORM_DS");
                    Uri insert = context2.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (insert != null) {
                        fileOutputStream = context2.getContentResolver().openOutputStream(insert);
                    } else {
                        fileOutputStream = null;
                    }
                } else {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "/STORM_DS");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    fileOutputStream = new FileOutputStream(new File(file, str9));
                }
                if (fileOutputStream != null) {
                    bitmap2.compress((Bitmap.CompressFormat) this.h0, 100, fileOutputStream);
                    fileOutputStream.close();
                }
                xe1 xe1Var6 = xk1.a;
                jv2 jv2Var4 = e04.a;
                try {
                    ag agVar = new ag(context2, str9, (qa4) this.i0, null, 8);
                    r41Var2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    r41Var2 = null;
                }
                try {
                    this.Y = 3;
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    xe1 xe1Var7 = xk1.a;
                    jv2 jv2Var5 = e04.a;
                    m5 m5Var2 = new m5(context2, th, r41Var2, 15);
                    this.Y = 4;
                    break;
                }
            case 6:
                return x(obj);
            case 7:
                return A(obj);
            case 8:
                return z(obj);
            default:
                x71 x71Var = (x71) this.g0;
                ContentResolver contentResolver = (ContentResolver) this.e0;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                try {
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                n80 n80Var3 = (n80) this.Z;
                                ne2 ne2Var3 = (ne2) this.d0;
                                oi2.Y(obj);
                                n80Var = n80Var3;
                                ne2Var = ne2Var3;
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            n80Var2 = (n80) this.Z;
                            ne2 ne2Var4 = (ne2) this.d0;
                            oi2.Y(obj);
                            ne2Var2 = ne2Var4;
                            obj4 = obj;
                            if (!((Boolean) obj4).booleanValue()) {
                                n80Var2.c();
                                ja4 ja4Var = uv7.a;
                                Float f2 = new Float(Settings.Global.getFloat(((Context) this.i0).getContentResolver(), "animator_duration_scale", 1.0f));
                                this.d0 = ne2Var2;
                                this.Z = n80Var2;
                                this.Y = 2;
                                if (ne2Var2.a(f2, this) != x61Var7) {
                                    ne2 ne2Var5 = ne2Var2;
                                    n80Var = n80Var2;
                                    ne2Var = ne2Var5;
                                }
                                return x61Var7;
                            }
                            contentResolver.unregisterContentObserver(x71Var);
                            return jg7.a;
                        }
                    } else {
                        oi2.Y(obj);
                        ne2Var = (ne2) this.d0;
                        contentResolver.registerContentObserver((Uri) this.f0, false, x71Var);
                        n80Var = new n80((v80) this.h0);
                    }
                    this.d0 = ne2Var;
                    this.Z = n80Var;
                    this.Y = 1;
                    obj4 = n80Var.b(this);
                    if (obj4 != x61Var7) {
                        n80 n80Var4 = n80Var;
                        ne2Var2 = ne2Var;
                        n80Var2 = n80Var4;
                        if (!((Boolean) obj4).booleanValue()) {
                        }
                    } else {
                        return x61Var7;
                    }
                } catch (Throwable th4) {
                    contentResolver.unregisterContentObserver(x71Var);
                    throw th4;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(sz1 sz1Var, yh2 yh2Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 2;
        this.h0 = sz1Var;
        this.i0 = yh2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(ContentResolver contentResolver, Uri uri, x71 x71Var, v80 v80Var, Context context, r41 r41Var) {
        super(2, r41Var);
        this.X = 9;
        this.e0 = contentResolver;
        this.f0 = uri;
        this.g0 = x71Var;
        this.h0 = v80Var;
        this.i0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(Enum r1, Object obj, qn2 qn2Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.g0 = r1;
        this.h0 = obj;
        this.i0 = qn2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(la1 la1Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 0;
        this.i0 = la1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(String str, String str2, MelonDatabase melonDatabase, String str3, r41 r41Var) {
        super(2, r41Var);
        this.X = 1;
        this.f0 = str;
        this.g0 = str2;
        this.h0 = melonDatabase;
        this.i0 = str3;
    }
}
