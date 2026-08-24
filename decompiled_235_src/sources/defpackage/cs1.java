package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import me.magnum.melonds.database.MelonDatabase;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs1  reason: default package */
/* loaded from: classes.dex */
public class cs1 implements a70, b51, k61, mm5, lx, st6, s60, eo7, ba0, z31 {
    public static final cs1 B = new cs1(1);
    public static final cs1 L = new cs1(2);
    public static final cs1 R = new cs1(3);
    public static final cs1 X = new cs1(4);
    public static final cs1 Y = new cs1(5);
    public static final /* synthetic */ cs1 Z = new cs1(6);
    public static final cs1 d0 = new cs1(8);
    public static final cs1 e0 = new cs1(9);
    public static final /* synthetic */ cs1 f0 = new cs1(10);
    public static final cs1 g0 = new cs1(11);
    public static final cs1 h0 = new cs1(12);
    public static final cs1 i0 = new cs1(13);
    public static final cs1 j0 = new cs1(14);
    public static final cs1 k0 = new cs1(16);
    public static final cs1 l0 = new cs1(17);
    public static final cs1 m0 = new cs1(18);
    public static final fa6 n0 = new fa6(5);
    public static final fa6 o0 = new fa6(6);
    public static final cs1 p0 = new cs1(20);
    public final /* synthetic */ int A;

    public /* synthetic */ cs1(int i) {
        this.A = i;
    }

    public static final rq0 l(cs1 cs1Var, String str) {
        rq0 rq0Var = new rq0(str);
        rq0.d.put(str, rq0Var);
        return rq0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(6:5|6|7|(1:(1:(1:(2:64|(1:(11:67|68|69|55|18|(6:35|36|37|38|39|(2:41|42)(3:44|45|(5:47|(2:50|48)|51|52|(1:56)(4:54|55|18|(9:20|(2:23|21)|24|25|26|27|28|62|63)(0)))(3:57|18|(0)(0))))(0)|33|34|31|62|63)(2:70|71))(5:72|73|74|45|(0)(0)))(7:12|13|14|15|(6:17|18|(0)(0)|33|34|31)|62|63))(7:77|78|79|80|81|(1:83)(1:92)|(5:85|15|(0)|62|63)(2:86|(3:88|89|90)(6:91|14|15|(0)|62|63))))(2:93|94))(11:104|105|106|107|108|109|110|111|(1:113)|89|90)|95|(2:100|(3:102|89|90)(6:103|79|80|81|(0)(0)|(0)(0)))(5:99|80|81|(0)(0)|(0)(0))))|125|6|7|(0)(0)|95|(1:97)|100|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
        r1 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0064: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:19:0x0063 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0182 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:69:0x01de, B:26:0x00a9, B:65:0x01ca, B:68:0x01da, B:31:0x00c2, B:54:0x0175, B:55:0x017c, B:57:0x0182, B:60:0x0195, B:61:0x019a, B:34:0x00d7, B:44:0x0123, B:46:0x012b, B:48:0x0135, B:50:0x0147), top: B:126:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:69:0x01de, B:26:0x00a9, B:65:0x01ca, B:68:0x01da, B:31:0x00c2, B:54:0x0175, B:55:0x017c, B:57:0x0182, B:60:0x0195, B:61:0x019a, B:34:0x00d7, B:44:0x0123, B:46:0x012b, B:48:0x0135, B:50:0x0147), top: B:126:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:69:0x01de, B:26:0x00a9, B:65:0x01ca, B:68:0x01da, B:31:0x00c2, B:54:0x0175, B:55:0x017c, B:57:0x0182, B:60:0x0195, B:61:0x019a, B:34:0x00d7, B:44:0x0123, B:46:0x012b, B:48:0x0135, B:50:0x0147), top: B:126:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:69:0x01de, B:26:0x00a9, B:65:0x01ca, B:68:0x01da, B:31:0x00c2, B:54:0x0175, B:55:0x017c, B:57:0x0182, B:60:0x0195, B:61:0x019a, B:34:0x00d7, B:44:0x0123, B:46:0x012b, B:48:0x0135, B:50:0x0147), top: B:126:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023d A[Catch: all -> 0x0279, TryCatch #4 {all -> 0x0279, blocks: (B:73:0x01f0, B:77:0x0233, B:79:0x023d, B:80:0x024e, B:82:0x0254, B:85:0x027e, B:93:0x02d4, B:94:0x02dd, B:96:0x02e3, B:97:0x02f1), top: B:120:0x01f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d4 A[Catch: all -> 0x0279, TryCatch #4 {all -> 0x0279, blocks: (B:73:0x01f0, B:77:0x0233, B:79:0x023d, B:80:0x024e, B:82:0x0254, B:85:0x027e, B:93:0x02d4, B:94:0x02dd, B:96:0x02e3, B:97:0x02f1), top: B:120:0x01f0 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02b7 -> B:69:0x01de). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x02c0 -> B:69:0x01de). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(MelonDatabase melonDatabase, String str, String str2, String str3, List list, Long l, s41 s41Var) {
        qs1 qs1Var;
        x61 x61Var;
        int i;
        String str4;
        long j;
        Long l2;
        String str5;
        MelonDatabase melonDatabase2;
        Long l3;
        String str6;
        List<td5> list2;
        String str7;
        String str8;
        List list3;
        Object S;
        long longValue;
        Long l4;
        String str9;
        String str10;
        List list4;
        long j2;
        long longValue2;
        String str11;
        String str12;
        Iterator it;
        x61 x61Var2;
        long j3;
        MelonDatabase melonDatabase3;
        List list5;
        String str13;
        long j4;
        Iterator it2;
        Object obj;
        td5 td5Var;
        long longValue3;
        td5 td5Var2;
        long j5;
        String str14;
        String str15;
        Object obj2;
        if (s41Var instanceof qs1) {
            qs1 qs1Var2 = (qs1) s41Var;
            int i2 = qs1Var2.k0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qs1Var2.k0 = i2 - Integer.MIN_VALUE;
                qs1Var = qs1Var2;
                Object obj3 = qs1Var.j0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = qs1Var.k0;
                String str16 = "EmbeddedActionReplay";
                String str17 = ")";
                String str18 = 5;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    str4 = "EmbeddedActionReplay";
                                    str18 = obj2;
                                }
                                if (i != 4) {
                                    if (i == 5) {
                                        long j6 = qs1Var.i0;
                                        j = 0;
                                        long j7 = qs1Var.h0;
                                        Iterator it3 = qs1Var.f0;
                                        List list6 = qs1Var.d0;
                                        String str19 = qs1Var.Z;
                                        String str20 = qs1Var.Y;
                                        String str21 = qs1Var.X;
                                        MelonDatabase melonDatabase4 = qs1Var.R;
                                        oi2.Y(obj3);
                                        melonDatabase2 = melonDatabase4;
                                        str7 = str20;
                                        x61Var2 = x61Var;
                                        str12 = "EmbeddedActionReplay";
                                        str11 = ")";
                                        it = it3;
                                        list2 = list6;
                                        str9 = str19;
                                        String str22 = str21;
                                        long j8 = j7;
                                        x61Var = x61Var2;
                                        longValue2 = j6;
                                        longValue = j8;
                                        str16 = str12;
                                        str17 = str11;
                                        str18 = str22;
                                        if (!it.hasNext()) {
                                            try {
                                                try {
                                                    td5Var2 = (td5) it.next();
                                                    bn0 u = melonDatabase2.u();
                                                    str11 = str17;
                                                    x61 x61Var3 = x61Var;
                                                    cn0 cn0Var = new cn0(null, longValue2, td5Var2.a);
                                                    qs1Var.R = melonDatabase2;
                                                    qs1Var.X = str18;
                                                    qs1Var.Y = str7;
                                                    qs1Var.Z = str9;
                                                    qs1Var.d0 = list2;
                                                    qs1Var.e0 = null;
                                                    qs1Var.f0 = it;
                                                    qs1Var.g0 = td5Var2;
                                                    qs1Var.h0 = longValue;
                                                    qs1Var.i0 = longValue2;
                                                    qs1Var.k0 = 4;
                                                    j5 = longValue2;
                                                    obj = hv.S(qs1Var, u.a, false, true, new y(13, u, cn0Var));
                                                    x61Var2 = x61Var3;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str12 = str16;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                            str12 = str16;
                                            if (obj != x61Var2) {
                                                it2 = it;
                                                j3 = longValue;
                                                td5Var = td5Var2;
                                                melonDatabase3 = melonDatabase2;
                                                list5 = list2;
                                                j4 = j5;
                                                str13 = str18;
                                                longValue3 = ((Number) obj).longValue();
                                                if (longValue3 <= j) {
                                                    List<sd5> list7 = td5Var.b;
                                                    ArrayList arrayList = new ArrayList(ht0.v0(list7, 10));
                                                    for (sd5 sd5Var : list7) {
                                                        arrayList.add(new zm0(null, longValue3, j3, sd5Var.a, sd5Var.b, sd5Var.c, false));
                                                        j3 = j3;
                                                    }
                                                    long j9 = j3;
                                                    vm0 s = melonDatabase3.s();
                                                    qs1Var.R = melonDatabase3;
                                                    qs1Var.X = str13;
                                                    qs1Var.Y = str7;
                                                    qs1Var.Z = str9;
                                                    qs1Var.d0 = list5;
                                                    qs1Var.e0 = null;
                                                    qs1Var.f0 = it2;
                                                    qs1Var.g0 = null;
                                                    qs1Var.h0 = j9;
                                                    qs1Var.i0 = j4;
                                                    qs1Var.k0 = 5;
                                                    Iterator it4 = it2;
                                                    if (hv.S(qs1Var, s.a, false, true, new rm0(s, arrayList, 0)) == x61Var2) {
                                                        return x61Var2;
                                                    }
                                                    long j10 = j4;
                                                    list2 = list5;
                                                    melonDatabase2 = melonDatabase3;
                                                    j8 = j9;
                                                    j6 = j10;
                                                    it = it4;
                                                    str22 = str13;
                                                    x61Var = x61Var2;
                                                    longValue2 = j6;
                                                    longValue = j8;
                                                    str16 = str12;
                                                    str17 = str11;
                                                    str18 = str22;
                                                    if (!it.hasNext()) {
                                                        str12 = str16;
                                                        String str23 = str17;
                                                        int i3 = 0;
                                                        for (td5 td5Var3 : list2) {
                                                            i3 += td5Var3.b.size();
                                                        }
                                                        str4 = str12;
                                                        try {
                                                            Log.i(str4, "Successfully populated " + i3 + " authentic cheats for " + ((String) str18) + " / " + str9 + " (" + str7 + str23);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                        return jg7.a;
                                                    }
                                                } else {
                                                    Iterator it5 = it2;
                                                    longValue = j3;
                                                    x61Var = x61Var2;
                                                    longValue2 = j4;
                                                    list2 = list5;
                                                    melonDatabase2 = melonDatabase3;
                                                    str16 = str12;
                                                    str17 = str11;
                                                    it = it5;
                                                    str18 = str13;
                                                    if (!it.hasNext()) {
                                                    }
                                                }
                                            } else {
                                                return x61Var2;
                                            }
                                        }
                                        th = th3;
                                        str4 = str12;
                                        lb1.w("Failed inserting cheats for ", str18, ": ", th.getMessage(), str4);
                                        return jg7.a;
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                j = 0;
                                j4 = qs1Var.i0;
                                long j11 = qs1Var.h0;
                                td5Var = qs1Var.g0;
                                Iterator it6 = qs1Var.f0;
                                list5 = qs1Var.d0;
                                String str24 = qs1Var.Z;
                                String str25 = qs1Var.Y;
                                String str26 = qs1Var.X;
                                melonDatabase3 = qs1Var.R;
                                oi2.Y(obj3);
                                obj = obj3;
                                x61Var2 = x61Var;
                                str12 = "EmbeddedActionReplay";
                                str11 = ")";
                                j3 = j11;
                                str7 = str25;
                                str13 = str26;
                                it2 = it6;
                                str9 = str24;
                                longValue3 = ((Number) obj).longValue();
                                if (longValue3 <= j) {
                                }
                            } else {
                                j = 0;
                                j2 = qs1Var.h0;
                                list4 = qs1Var.d0;
                                str9 = qs1Var.Z;
                                str7 = qs1Var.Y;
                                String str27 = qs1Var.X;
                                melonDatabase2 = qs1Var.R;
                                oi2.Y(obj3);
                                str15 = str27;
                                long j12 = j2;
                                list2 = list4;
                                longValue2 = ((Number) obj3).longValue();
                                longValue = j12;
                                str14 = str15;
                                if (longValue2 > j) {
                                    it = list2.iterator();
                                    str18 = str14;
                                    if (!it.hasNext()) {
                                    }
                                    th = th3;
                                    str4 = str12;
                                    lb1.w("Failed inserting cheats for ", str18, ": ", th.getMessage(), str4);
                                }
                                return jg7.a;
                            }
                        } else {
                            j = 0;
                            l3 = qs1Var.e0;
                            list2 = qs1Var.d0;
                            str8 = qs1Var.Z;
                            str7 = qs1Var.Y;
                            str6 = qs1Var.X;
                            melonDatabase2 = qs1Var.R;
                            oi2.Y(obj3);
                            longValue = ((Number) obj3).longValue();
                            l4 = l3;
                            str9 = str8;
                            if (qs6.v0(str7)) {
                                str10 = "NDS Game (" + str6 + ")";
                            } else {
                                str10 = str7;
                            }
                            if (l4 != null) {
                                longValue2 = l4.longValue();
                                str14 = str6;
                                if (longValue2 > j) {
                                }
                                return jg7.a;
                            }
                            ip2 v = melonDatabase2.v();
                            lp2 lp2Var = new lp2(null, str10, str6, str9);
                            qs1Var.R = melonDatabase2;
                            qs1Var.X = str6;
                            qs1Var.Y = str7;
                            qs1Var.Z = str9;
                            qs1Var.d0 = list2;
                            qs1Var.e0 = null;
                            qs1Var.h0 = longValue;
                            qs1Var.k0 = 3;
                            Object S2 = hv.S(qs1Var, v.a, false, true, new bi2(3, v, lp2Var));
                            if (S2 == x61Var) {
                                return x61Var;
                            }
                            list4 = list2;
                            obj3 = S2;
                            j2 = longValue;
                            str15 = str6;
                            long j122 = j2;
                            list2 = list4;
                            longValue2 = ((Number) obj3).longValue();
                            longValue = j122;
                            str14 = str15;
                            if (longValue2 > j) {
                            }
                            return jg7.a;
                        }
                    } else {
                        j = 0;
                        l2 = null;
                        l3 = qs1Var.e0;
                        list2 = qs1Var.d0;
                        str8 = qs1Var.Z;
                        str7 = qs1Var.Y;
                        str6 = qs1Var.X;
                        melonDatabase2 = qs1Var.R;
                        oi2.Y(obj3);
                    }
                } else {
                    j = 0;
                    l2 = null;
                    oi2.Y(obj3);
                    try {
                        xm0 t = melonDatabase.t();
                        qs1Var.R = melonDatabase;
                        str5 = str;
                        try {
                            qs1Var.X = str5;
                            qs1Var.Y = str2;
                            qs1Var.Z = str3;
                            qs1Var.d0 = list;
                            qs1Var.e0 = l;
                            qs1Var.k0 = 1;
                            try {
                                obj3 = hv.S(qs1Var, t.a, true, false, new k4(27));
                                if (obj3 != x61Var) {
                                    melonDatabase2 = melonDatabase;
                                    l3 = l;
                                    str6 = str5;
                                    list2 = list;
                                    str7 = str2;
                                    str8 = str3;
                                }
                                return x61Var;
                            } catch (Throwable th5) {
                                th = th5;
                                str4 = "EmbeddedActionReplay";
                                str18 = str5;
                                lb1.w("Failed inserting cheats for ", str18, ": ", th.getMessage(), str4);
                                return jg7.a;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        str5 = str;
                    }
                }
                list3 = (List) obj3;
                if (list3.isEmpty() && ((ym0) gt0.H0(list3)).a != null) {
                    Long l5 = ((ym0) gt0.H0(list3)).a;
                    l5.getClass();
                    longValue = l5.longValue();
                    l4 = l3;
                    str9 = str8;
                    if (qs6.v0(str7)) {
                    }
                    if (l4 != null) {
                    }
                } else {
                    xm0 t2 = melonDatabase2.t();
                    ym0 ym0Var = new ym0("Action Replay Official", l2);
                    qs1Var.R = melonDatabase2;
                    qs1Var.X = str6;
                    qs1Var.Y = str7;
                    qs1Var.Z = str8;
                    qs1Var.d0 = list2;
                    qs1Var.e0 = l3;
                    qs1Var.k0 = 2;
                    S = hv.S(qs1Var, t2.a, false, true, new y(11, t2, ym0Var));
                    if (S != x61Var) {
                        return x61Var;
                    }
                    obj3 = S;
                    longValue = ((Number) obj3).longValue();
                    l4 = l3;
                    str9 = str8;
                    if (qs6.v0(str7)) {
                    }
                    if (l4 != null) {
                    }
                }
            }
        }
        qs1Var = new s41(s41Var);
        Object obj32 = qs1Var.j0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = qs1Var.k0;
        String str162 = "EmbeddedActionReplay";
        String str172 = ")";
        String str182 = 5;
        if (i == 0) {
        }
        list3 = (List) obj32;
        if (list3.isEmpty()) {
        }
        xm0 t22 = melonDatabase2.t();
        ym0 ym0Var2 = new ym0("Action Replay Official", l2);
        qs1Var.R = melonDatabase2;
        qs1Var.X = str6;
        qs1Var.Y = str7;
        qs1Var.Z = str8;
        qs1Var.d0 = list2;
        qs1Var.e0 = l3;
        qs1Var.k0 = 2;
        S = hv.S(qs1Var, t22.a, false, true, new y(11, t22, ym0Var2));
        if (S != x61Var) {
        }
    }

    public static final void n(pw pwVar) {
        zb zbVar = pw.h;
        if (pw.i == null) {
            pw.i = new pw();
            ow owVar = new ow("Okio Watchdog");
            owVar.setDaemon(true);
            owVar.start();
        }
        long nanoTime = System.nanoTime();
        long j = pwVar.c;
        boolean z = pwVar.a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i != 0 && z) {
            pwVar.g = Math.min(j, pwVar.c() - nanoTime) + nanoTime;
        } else if (i != 0) {
            pwVar.g = nanoTime + j;
        } else if (z) {
            pwVar.g = pwVar.c();
        } else {
            throw new AssertionError();
        }
        zb zbVar2 = pw.h;
        int i2 = zbVar2.B + 1;
        zbVar2.B = i2;
        pw[] pwVarArr = (pw[]) zbVar2.L;
        if (i2 == pwVarArr.length) {
            pw[] pwVarArr2 = new pw[i2 * 2];
            fv.w0(pwVarArr, pwVarArr2, 0, 0, 14);
            zbVar2.L = pwVarArr2;
        }
        zbVar2.o(i2, pwVar);
        if (pwVar.f == 1) {
            pw.k.signal();
        }
    }

    public static pw o() {
        zb zbVar = pw.h;
        pw pwVar = ((pw[]) zbVar.L)[1];
        if (pwVar == null) {
            long nanoTime = System.nanoTime();
            pw.k.await(pw.l, TimeUnit.MILLISECONDS);
            if (((pw[]) zbVar.L)[1] != null || System.nanoTime() - nanoTime < pw.m) {
                return null;
            }
            return pw.i;
        }
        long nanoTime2 = pwVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            pw.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        zbVar.u(pwVar);
        pwVar.e = 2;
        return pwVar;
    }

    public static cs1 p(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        np2.s("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, a75.n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        np2.S(context, obtainStyledAttributes, 4);
        np2.S(context, obtainStyledAttributes, 9);
        np2.S(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        me6.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new t(RecyclerView.B1)).a();
        obtainStyledAttributes.recycle();
        cs1 cs1Var = new cs1(26);
        np2.v(rect.left);
        np2.v(rect.top);
        np2.v(rect.right);
        np2.v(rect.bottom);
        return cs1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.hardware.camera2.params.OutputConfiguration] */
    public static xi q(Surface surface, Integer num, vs0 vs0Var, rp4 rp4Var, qp4 qp4Var, sp4 sp4Var, List list, Size size, boolean z, int i, String str, int i2) {
        Integer num2;
        vs0 vs0Var2;
        boolean z2;
        int i3;
        ?? outputConfiguration;
        Class cls;
        OutputConfiguration outputConfiguration2;
        Surface surface2 = surface;
        vs0 vs0Var3 = vs0.m0;
        if ((i2 & 2) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & 4) != 0) {
            vs0Var2 = vs0Var3;
        } else {
            vs0Var2 = vs0Var;
        }
        if ((i2 & 512) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 1024) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        vs0Var2.getClass();
        if (vs0Var2 == vs0.p0 && Build.VERSION.SDK_INT >= 35) {
            if (num2 != null) {
                if (size != null) {
                    outputConfiguration2 = xp.f(num2.intValue(), size);
                } else {
                    i.m("Required value was null.");
                    return null;
                }
            } else {
                i.m("Required value was null.");
                return null;
            }
        } else if (vs0Var2 != vs0Var3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26) {
                if (size != null) {
                    if (vs0Var2 != vs0.o0) {
                        if (vs0Var2 != vs0.n0) {
                            if (vs0Var2 != vs0.q0) {
                                if (vs0Var2 == vs0.r0) {
                                    if (i4 >= 35) {
                                        cls = MediaRecorder.class;
                                    } else {
                                        i.m("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                                        return null;
                                    }
                                } else {
                                    e41.y(vs0Var2, "Unsupported OutputType: ");
                                    return null;
                                }
                            } else if (i4 >= 35) {
                                cls = MediaCodec.class;
                            } else {
                                i.m("OutputType.MEDIA_CODEC requires API 35 or higher.");
                                return null;
                            }
                        } else {
                            cls = SurfaceHolder.class;
                        }
                    } else {
                        cls = SurfaceTexture.class;
                    }
                    outputConfiguration2 = k2.d(size, cls);
                } else {
                    i.m("Size must defined when creating a deferred OutputConfiguration.");
                    return null;
                }
            } else {
                i.m(lb1.k("Deferred OutputConfigurations are not supported on API ", i4, " (requires API 26)"));
                return null;
            }
        } else if (surface2 != null) {
            try {
                if (i3 != -1) {
                    outputConfiguration = new OutputConfiguration(i3, surface2);
                } else {
                    outputConfiguration = new OutputConfiguration(surface2);
                }
                surface2 = outputConfiguration;
                outputConfiguration2 = surface2;
            } catch (Throwable th) {
                Log.w("CXCP", "Failed to create an OutputConfiguration for " + surface2 + '!', th);
                return null;
            }
        } else {
            i.m("non-null surface!");
            return null;
        }
        if (z2 && Build.VERSION.SDK_INT >= 26) {
            outputConfiguration2.enableSurfaceSharing();
        }
        if (str != null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                if (i5 >= 28) {
                    outputConfiguration2.setPhysicalCameraId(str);
                }
            } else {
                u34.f(lb1.k("physicalCameraId is not supported on API ", i5, " (requires API 28)"));
                return null;
            }
        }
        if (rp4Var != null) {
            int i6 = rp4Var.a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                o2.r(outputConfiguration2, i6);
            } else if (i6 != 0) {
                StringBuilder t = xg6.t("Cannot set mirrorMode to a non-default value on API ", i7, ". This may result in unexpected behavior. Requested ");
                t.append((Object) rp4.a(i6));
                Log.w("CXCP", t.toString());
            }
        }
        if (qp4Var != null) {
            long j = qp4Var.a;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                o2.s(outputConfiguration2, j);
            } else if (j != 1) {
                StringBuilder t2 = xg6.t("Cannot set dynamicRangeProfile to a non-default value on API ", i8, ". This may result in unexpected behavior. Requested ");
                t2.append((Object) qp4.a(j));
                Log.w("CXCP", t2.toString());
            }
        }
        if (sp4Var != null && Build.VERSION.SDK_INT >= 33) {
            o2.B(outputConfiguration2, sp4Var.a);
        }
        if (!list.isEmpty()) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 31) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw i61.j(it);
                }
            } else {
                Log.w("CXCP", "Cannot add sensorPixelModeUsed value on API " + i9 + ". This may result in unexpected behavior. Requested " + list);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            outputConfiguration2.getMaxSharedSurfaceCount();
        }
        return new xi(outputConfiguration2);
    }

    public static ArrayList s(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<String> z0 = qs6.z0(str);
        StringBuilder sb = new StringBuilder();
        String str2 = null;
        for (String str3 : z0) {
            String obj = qs6.T0(str3).toString();
            if (!xs6.g0(obj, "::", false) && !xs6.g0(obj, "[", false)) {
                Pattern compile = Pattern.compile("^[0-9A-Fa-f]{8}\\s+[0-9A-Fa-f]{8}$");
                compile.getClass();
                if (compile.matcher(obj).matches()) {
                    sb.append(obj);
                    sb.append("\n");
                }
            } else {
                if (str2 != null && !qs6.v0(sb)) {
                    arrayList2.add(new sd5(str2, "", qs6.T0(sb.toString()).toString()));
                    sb.setLength(0);
                }
                str2 = qs6.T0(qs6.E0(qs6.D0(qs6.D0(obj, "::"), "["), "]")).toString();
            }
        }
        if (str2 != null && !qs6.v0(sb)) {
            arrayList2.add(new sd5(str2, "", qs6.T0(sb.toString()).toString()));
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new td5("Action Replay Cheats", arrayList2));
        }
        return arrayList;
    }

    public static String t(int i, ByteBuffer byteBuffer) {
        int i2;
        byteBuffer.getClass();
        if (i >= 0) {
            if (byteBuffer.remaining() >= 4) {
                i2 = byteBuffer.getInt();
            } else {
                i2 = 0;
            }
            int remaining = byteBuffer.remaining();
            if (i > remaining) {
                i = remaining;
            }
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 <= i) {
                i = i2;
            }
            return new String(bArr, 0, i, qm0.a);
        }
        i.h("slotBytes must not be negative");
        return null;
    }

    public void a(Drawable drawable, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(257732500);
        if (xq2Var.h(drawable)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74 i4 = dj6.i(x64.a, l41.e);
            boolean h = xq2Var.h(drawable);
            Object P = xq2Var.P();
            if (h || P == ox0.a) {
                P = new ro5(drawable, 16);
                xq2Var.l0(P);
            }
            h70.a(q60.v(i4, (qn2) P), xq2Var, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new sa5(this, i, 11, drawable);
        }
    }

    @Override // defpackage.ba0
    public byte[] b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.z31
    public long c(long j, long j2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L);
        int i = a66.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.st6
    public void d(rt6 rt6Var) {
        rt6Var.clear();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [dh5, java.lang.Object] */
    @Override // defpackage.eo7
    public on2 e(p0 p0Var) {
        if (p0Var.isAttachedToWindow()) {
            hu3 B2 = bl2.B(p0Var);
            if (B2 != null) {
                return ii2.o(p0Var, B2.getLifecycle());
            }
            p53.d("View tree for " + p0Var + " has no ViewTreeLifecycleOwner");
            e41.c();
            return null;
        }
        ?? obj = new Object();
        wh6 wh6Var = new wh6(p0Var, obj, 2);
        p0Var.addOnAttachStateChangeListener(wh6Var);
        obj.A = new le(9, p0Var, wh6Var);
        return new pj(obj, 21);
    }

    @Override // defpackage.a70
    public Rect f(Activity activity) {
        int i;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + i;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    @Override // defpackage.st6
    public boolean g(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [y80, k80, java.lang.Object] */
    @Override // defpackage.b51
    public Object h(Object obj) {
        switch (this.A) {
            case 3:
                yl5 yl5Var = (yl5) obj;
                try {
                    ?? obj2 = new Object();
                    yl5Var.n().C(obj2);
                    xl5 xl5Var = new xl5(yl5Var.k(), yl5Var.h(), obj2);
                    yl5Var.close();
                    return xl5Var;
                } catch (Throwable th) {
                    yl5Var.close();
                    throw th;
                }
            default:
                ((yl5) obj).close();
                return null;
        }
    }

    public void i(final Icon icon, px0 px0Var, final int i) {
        int i2;
        boolean z;
        cf5 t;
        eo2 eo2Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2116504409);
        if (xq2Var.h(icon)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            Context context = (Context) xq2Var.j(kf.b);
            boolean f = xq2Var.f(icon) | xq2Var.f(context);
            Object P = xq2Var.P();
            if (f || P == ox0.a) {
                P = icon.loadDrawable(context);
                xq2Var.l0(P);
            }
            Drawable drawable = (Drawable) P;
            if (drawable == null) {
                t = xq2Var.t();
                if (t != null) {
                    eo2Var = new eo2(this, icon, i, 0) { // from class: r07
                        public final /* synthetic */ int A;
                        public final /* synthetic */ cs1 B;
                        public final /* synthetic */ Icon L;

                        {
                            this.A = r4;
                            this.B = this;
                        }

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            int i4 = this.A;
                            jg7 jg7Var = jg7.a;
                            Icon icon2 = this.L;
                            cs1 cs1Var = this.B;
                            px0 px0Var2 = (px0) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    cs1Var.i(icon2, px0Var2, ii2.a0(49));
                                    return jg7Var;
                                default:
                                    cs1Var.i(icon2, px0Var2, ii2.a0(49));
                                    return jg7Var;
                            }
                        }
                    };
                    t.d = eo2Var;
                }
                return;
            }
            a(drawable, xq2Var, 48);
        } else {
            xq2Var.V();
        }
        t = xq2Var.t();
        if (t != null) {
            eo2Var = new eo2(this, icon, i, 1) { // from class: r07
                public final /* synthetic */ int A;
                public final /* synthetic */ cs1 B;
                public final /* synthetic */ Icon L;

                {
                    this.A = r4;
                    this.B = this;
                }

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    int i4 = this.A;
                    jg7 jg7Var = jg7.a;
                    Icon icon2 = this.L;
                    cs1 cs1Var = this.B;
                    px0 px0Var2 = (px0) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            cs1Var.i(icon2, px0Var2, ii2.a0(49));
                            return jg7Var;
                        default:
                            cs1Var.i(icon2, px0Var2, ii2.a0(49));
                            return jg7Var;
                    }
                }
            };
            t.d = eo2Var;
        }
    }

    @Override // defpackage.lx
    public int j() {
        return 2;
    }

    @Override // defpackage.s60
    public long k(int i, ls0 ls0Var) {
        return ((a47) ls0Var.e).j(i);
    }

    public synchronized rq0 r(String str) {
        rq0 rq0Var;
        String str2;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = rq0.d;
            rq0Var = (rq0) linkedHashMap.get(str);
            if (rq0Var == null) {
                if (xs6.g0(str, "TLS_", false)) {
                    str2 = "SSL_".concat(str.substring(4));
                } else if (xs6.g0(str, "SSL_", false)) {
                    str2 = "TLS_".concat(str.substring(4));
                } else {
                    str2 = str;
                }
                rq0Var = (rq0) linkedHashMap.get(str2);
                if (rq0Var == null) {
                    rq0Var = new rq0(str);
                }
                linkedHashMap.put(str, rq0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return rq0Var;
    }

    public String toString() {
        switch (this.A) {
            case 13:
                return "coil.request.NullRequestData";
            case 17:
                return "Start";
            case 28:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
