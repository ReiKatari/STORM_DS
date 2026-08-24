package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s9  reason: default package */
/* loaded from: classes.dex */
public final class s9 implements as4 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    public s9(fp fpVar, s47 s47Var, List list, qh1 qh1Var, ki2 ki2Var) {
        List list2;
        int i;
        String str;
        String str2;
        int i2;
        yt1 yt1Var;
        List list3;
        fp fpVar2 = fpVar;
        s47 s47Var2 = s47Var;
        this.a = fpVar2;
        this.b = list;
        xr3 xr3Var = xr3.NONE;
        int i3 = 0;
        this.c = kj2.M(xr3Var, new on2(this) { // from class: w84
            public final /* synthetic */ s9 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.on2
            public final Object c() {
                int i4 = r2;
                float f = RecyclerView.B1;
                zr4 zr4Var = null;
                int i5 = 1;
                s9 s9Var = this.B;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) s9Var.e;
                        if (!arrayList.isEmpty()) {
                            Object obj = arrayList.get(0);
                            float b = ((zr4) obj).a.b();
                            int size = arrayList.size() - 1;
                            Object obj2 = obj;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float b2 = ((zr4) obj3).a.b();
                                    obj = obj2;
                                    if (Float.compare(b, b2) < 0) {
                                        obj = obj3;
                                        b = b2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        obj2 = obj;
                                    }
                                }
                            }
                            zr4Var = obj;
                        }
                        zr4 zr4Var2 = zr4Var;
                        if (zr4Var2 != null) {
                            f = zr4Var2.a.b();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) s9Var.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float c = ((zr4) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            Object obj5 = obj4;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float c2 = ((zr4) obj6).a.i.c();
                                    obj4 = obj5;
                                    if (Float.compare(c, c2) < 0) {
                                        obj4 = obj6;
                                        c = c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        obj5 = obj4;
                                    }
                                }
                            }
                            zr4Var = obj4;
                        }
                        zr4 zr4Var3 = zr4Var;
                        if (zr4Var3 != null) {
                            f = zr4Var3.a.i.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        this.d = kj2.M(xr3Var, new on2(this) { // from class: w84
            public final /* synthetic */ s9 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.on2
            public final Object c() {
                int i4 = r2;
                float f = RecyclerView.B1;
                zr4 zr4Var = null;
                int i5 = 1;
                s9 s9Var = this.B;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) s9Var.e;
                        if (!arrayList.isEmpty()) {
                            Object obj = arrayList.get(0);
                            float b = ((zr4) obj).a.b();
                            int size = arrayList.size() - 1;
                            Object obj2 = obj;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float b2 = ((zr4) obj3).a.b();
                                    obj = obj2;
                                    if (Float.compare(b, b2) < 0) {
                                        obj = obj3;
                                        b = b2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        obj2 = obj;
                                    }
                                }
                            }
                            zr4Var = obj;
                        }
                        zr4 zr4Var2 = zr4Var;
                        if (zr4Var2 != null) {
                            f = zr4Var2.a.b();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) s9Var.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float c = ((zr4) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            Object obj5 = obj4;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float c2 = ((zr4) obj6).a.i.c();
                                    obj4 = obj5;
                                    if (Float.compare(c, c2) < 0) {
                                        obj4 = obj6;
                                        c = c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                        obj5 = obj4;
                                    }
                                }
                            }
                            zr4Var = obj4;
                        }
                        zr4 zr4Var3 = zr4Var;
                        if (zr4Var3 != null) {
                            f = zr4Var3.a.i.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        ds4 ds4Var = s47Var2.b;
        fp fpVar3 = gp.a;
        ArrayList arrayList = fpVar2.R;
        String str3 = fpVar2.B;
        yt1 yt1Var2 = yt1.A;
        if (arrayList != null) {
            list2 = gt0.d1(arrayList, new zh2(8));
        } else {
            list2 = yt1Var2;
        }
        ArrayList arrayList2 = new ArrayList();
        pu puVar = new pu();
        int size = list2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            ep epVar = (ep) list2.get(i4);
            ep a = ep.a(epVar, ds4Var.a((ds4) epVar.a), i3, 14);
            Object obj = a.a;
            int i6 = a.c;
            int i7 = a.b;
            while (i5 < i7 && !puVar.isEmpty()) {
                ep epVar2 = (ep) puVar.last();
                List list4 = list2;
                int i8 = epVar2.c;
                yt1 yt1Var3 = yt1Var2;
                Object obj2 = epVar2.a;
                if (i7 < i8) {
                    arrayList2.add(new ep(obj2, i5, i7));
                    i5 = i7;
                    list2 = list4;
                    yt1Var2 = yt1Var3;
                } else {
                    int i9 = size;
                    arrayList2.add(new ep(obj2, i5, i8));
                    i5 = epVar2.c;
                    while (!puVar.isEmpty() && i5 == ((ep) puVar.last()).c) {
                        puVar.removeLast();
                    }
                    list2 = list4;
                    yt1Var2 = yt1Var3;
                    size = i9;
                }
            }
            List list5 = list2;
            yt1 yt1Var4 = yt1Var2;
            int i10 = size;
            if (i5 < i7) {
                arrayList2.add(new ep(ds4Var, i5, i7));
                i5 = i7;
            }
            ep epVar3 = (ep) puVar.h();
            if (epVar3 != null) {
                int i11 = epVar3.c;
                Object obj3 = epVar3.a;
                int i12 = epVar3.b;
                if (i12 == i7 && i11 == i6) {
                    puVar.removeLast();
                    puVar.addLast(new ep(((ds4) obj3).a((ds4) obj), i7, i6));
                } else if (i12 == i11) {
                    arrayList2.add(new ep(obj3, i12, i11));
                    puVar.removeLast();
                    puVar.addLast(new ep(obj, i7, i6));
                } else if (i11 >= i6) {
                    puVar.addLast(new ep(((ds4) obj3).a((ds4) obj), i7, i6));
                } else {
                    u34.t();
                    throw null;
                }
            } else {
                puVar.addLast(new ep(obj, i7, i6));
            }
            i4++;
            list2 = list5;
            yt1Var2 = yt1Var4;
            size = i10;
            i3 = 0;
        }
        yt1 yt1Var5 = yt1Var2;
        while (i5 <= str3.length() && !puVar.isEmpty()) {
            ep epVar4 = (ep) puVar.last();
            Object obj4 = epVar4.a;
            int i13 = epVar4.c;
            arrayList2.add(new ep(obj4, i5, i13));
            while (!puVar.isEmpty() && i13 == ((ep) puVar.last()).c) {
                puVar.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str3.length()) {
            arrayList2.add(new ep(ds4Var, i5, str3.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new ep(ds4Var, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = i;
        while (i14 < size2) {
            ep epVar5 = (ep) arrayList2.get(i14);
            int i15 = epVar5.b;
            int i16 = epVar5.c;
            if (i15 != i16) {
                str = str3.substring(i15, i16);
            } else {
                str = "";
            }
            List a2 = gp.a(fpVar2, i15, i16, new k4(11));
            fp fpVar4 = new fp(str, a2 == null ? yt1Var5 : a2);
            ds4 ds4Var2 = (ds4) epVar5.a;
            if (ds4Var2.b == 0) {
                str2 = str3;
                i2 = size2;
                ds4Var2 = new ds4(ds4Var2.a, ds4Var.b, ds4Var2.c, ds4Var2.d, ds4Var2.e, ds4Var2.f, ds4Var2.g, ds4Var2.h, ds4Var2.i);
            } else {
                str2 = str3;
                i2 = size2;
            }
            s47 s47Var3 = new s47(s47Var2.a, ds4Var.a(ds4Var2));
            ?? r5 = fpVar4.A;
            if (r5 == 0) {
                yt1Var = yt1Var5;
            } else {
                yt1Var = r5;
            }
            List list6 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                ep epVar6 = (ep) list6.get(i17);
                int i18 = epVar6.b;
                ds4 ds4Var3 = ds4Var;
                int i19 = epVar6.c;
                if (gp.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        q53.a("placeholder can not overlap with paragraph.");
                    }
                    list3 = list6;
                    arrayList4.add(new ep(epVar6.a, i18 - i15, i19 - i15));
                } else {
                    list3 = list6;
                }
                i17++;
                list6 = list3;
                ds4Var = ds4Var3;
            }
            arrayList3.add(new zr4(new gj(str, s47Var3, yt1Var, arrayList4, ki2Var, qh1Var), i15, i16));
            i14++;
            fpVar2 = fpVar;
            s47Var2 = s47Var;
            str3 = str2;
            size2 = i2;
        }
        this.e = arrayList3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x007d, B:26:0x0053, B:28:0x0059, B:29:0x005d, B:31:0x0061, B:32:0x006c, B:22:0x0044, B:25:0x0050, B:19:0x003d), top: B:40:0x0028 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0050 -> B:26:0x0053). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007a -> B:35:0x007d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.x61 d(defpackage.s9 r7, defpackage.s41 r8) {
        /*
            java.lang.Object r0 = r7.d
            v80 r0 = (defpackage.v80) r0
            java.lang.Object r1 = r7.e
            pu r1 = (defpackage.pu) r1
            boolean r2 = r8 instanceof defpackage.m35
            if (r2 == 0) goto L1b
            r2 = r8
            m35 r2 = (defpackage.m35) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.Z = r3
            goto L20
        L1b:
            m35 r2 = new m35
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.X
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L36
            int r4 = r2.R
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L34
            goto L7d
        L34:
            r8 = move-exception
            goto L82
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L3d:
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L34
            goto L50
        L41:
            defpackage.oi2.Y(r8)
        L44:
            r2.Z = r6     // Catch: java.lang.Throwable -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = defpackage.v80.L(r0, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L50
            goto L7c
        L50:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L53:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L44
            java.lang.Object r8 = r0.m()     // Catch: java.lang.Throwable -> L34
        L5d:
            boolean r4 = r8 instanceof defpackage.fm0     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L6c
            defpackage.gm0.b(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.m()     // Catch: java.lang.Throwable -> L34
            goto L5d
        L6c:
            int r4 = r1.L     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> L34
            h4 r8 = (defpackage.h4) r8     // Catch: java.lang.Throwable -> L34
            r2.R = r4     // Catch: java.lang.Throwable -> L34
            r2.Z = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.o(r1, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L7d
        L7c:
            return r3
        L7d:
            int r8 = r1.L     // Catch: java.lang.Throwable -> L34
            if (r4 != r8) goto L53
            goto L44
        L82:
            r7.E(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9.d(s9, s41):x61");
    }

    public static final void e(s9 s9Var, VideoRenderer videoRenderer) {
        String str;
        jq jqVar = (jq) s9Var.a;
        int i = bx1.a[videoRenderer.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "Compute";
                    } else {
                        i.d();
                        return;
                    }
                } else {
                    str = "Vulkan";
                }
            } else {
                str = "OpenGL";
            }
        } else {
            str = "Software";
        }
        zb zbVar = new zb(jqVar);
        wb wbVar = (wb) zbVar.L;
        zbVar.z(R.string.renderer_init_failed_title);
        wbVar.f = jqVar.getString(R.string.renderer_init_failed_message, str);
        zbVar.y(R.string.settings, new xw1(s9Var, 10));
        zbVar.x(R.string.cancel, new xw1(s9Var, 0));
        wbVar.n = new yw1(s9Var, 0);
        zbVar.B();
    }

    public static final void f(s9 s9Var, VideoRenderer videoRenderer) {
        String str;
        jq jqVar = (jq) s9Var.a;
        int i = bx1.a[videoRenderer.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "Compute";
                    } else {
                        i.d();
                        return;
                    }
                } else {
                    str = "Vulkan";
                }
            } else {
                str = "OpenGL";
            }
        } else {
            str = "Software";
        }
        zb zbVar = new zb(jqVar);
        wb wbVar = (wb) zbVar.L;
        zbVar.z(R.string.renderer_unsupported_title);
        wbVar.f = jqVar.getString(R.string.renderer_unsupported_message, str);
        zbVar.y(R.string.settings, new xw1(s9Var, 3));
        zbVar.x(R.string.cancel, new xw1(s9Var, 4));
        wbVar.n = new yw1(s9Var, 2);
        zbVar.B();
    }

    public vw1 A() {
        return (vw1) ((uo7) this.c).getValue();
    }

    public void B(String str, String str2) {
        str2.getClass();
        ww2 ww2Var = (ww2) this.c;
        ww2Var.getClass();
        ft7.c(str);
        ft7.d(str2, str);
        ww2Var.r(str);
        ft7.a(ww2Var, str, str2);
    }

    public int C(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.a).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((nb3.p(charAt, 8192) < 0 || nb3.p(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void D(String str, mk5 mk5Var) {
        str.getClass();
        if (str.length() > 0) {
            if (mk5Var == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                    i.f(lb1.A("method ", str, " must have a request body."));
                    return;
                }
            } else if (!ii2.J(str)) {
                i.f(lb1.A("method ", str, " must not have a request body."));
                return;
            }
            this.b = str;
            this.d = mk5Var;
            return;
        }
        i.h("method.isEmpty() == true");
    }

    public void E(Throwable th) {
        pu puVar = (pu) this.e;
        v80 v80Var = (v80) this.d;
        if (v80Var.k(th, false)) {
            for (Object m = v80Var.m(); !(m instanceof fm0); m = v80Var.m()) {
                gm0.b(m);
                puVar.addLast(m);
            }
            if (!puVar.isEmpty()) {
                ((qn2) this.a).g(new ArrayList(puVar));
                puVar.clear();
            }
        }
    }

    public void F() {
        ao4.e((short[]) this.a);
        int i = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = (short[][]) this.b;
            if (i2 >= sArr.length) {
                break;
            }
            ao4.e(sArr[i2]);
            i2++;
        }
        while (true) {
            short[][] sArr2 = (short[][]) this.c;
            if (i < sArr2.length) {
                ao4.e(sArr2[i]);
                i++;
            } else {
                ao4.e((short[]) this.d);
                return;
            }
        }
    }

    public void G(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        tp6 tp6Var = (tp6) ((LinkedHashMap) this.c).get(str);
        if (tp6Var != null) {
            tp6Var.l(obj);
        }
        tp6 tp6Var2 = (tp6) ((LinkedHashMap) this.d).get(str);
        if (tp6Var2 != null) {
            tp6Var2.l(obj);
        }
    }

    public boolean H(at2 at2Var) {
        return !(((v80) this.d).c(at2Var) instanceof fm0);
    }

    public void I(String str) {
        str.getClass();
        if (xs6.g0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (xs6.g0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        h03 h03Var = new h03(0);
        h03Var.e(null, str);
        this.a = h03Var.b();
    }

    public void J() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((gc4) obj).a;
            if (u(i2) == null) {
                int i3 = ic4.X;
                i.j(i61.t("Navigation destination ", mp2.C((rh) this.b, i2), " cannot be found in the navigation graph "), (mc4) this.d);
                return;
            }
        }
    }

    @Override // defpackage.as4
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zr4) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.as4
    public float b() {
        return ((Number) ((go3) this.c).getValue()).floatValue();
    }

    @Override // defpackage.as4
    public float c() {
        return ((Number) ((go3) this.d).getValue()).floatValue();
    }

    public void g(s90 s90Var, Class cls) {
        ((ArrayList) this.b).add(new vr4(s90Var, cls));
    }

    public void h(ka2 ka2Var, Class cls) {
        ((ArrayList) this.d).add(new vr4(ka2Var, cls));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bh5] */
    public tj0 i(vz vzVar, on2 on2Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        ?? obj = new Object();
        obj.A = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                vzVar.b(th);
                return xd5.X;
            }
            vw vwVar = (vw) this.c;
            do {
                i = vwVar.get();
                i2 = i + 1;
            } while (!vwVar.compareAndSet(i, i2));
            if ((134217727 & i2) == 1) {
                z = true;
            } else {
                z = false;
            }
            obj.A = (i2 >>> 27) & 15;
            ((ca4) this.d).a(vzVar);
            if (z && on2Var != null) {
                try {
                    on2Var.c();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                ca4 ca4Var = (ca4) this.d;
                                Object[] objArr = ca4Var.a;
                                int i4 = ca4Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((vz) objArr[i5]).b(th2);
                                }
                                ((ca4) this.d).d();
                                vw vwVar2 = (vw) this.c;
                                do {
                                    i3 = vwVar2.get();
                                } while (!vwVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new ap3(new u6(vzVar, this, (Object) obj, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r6.getRunCount() == 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi j(int i) {
        int intValue;
        Bidi bidi;
        int i2;
        Layout layout = (Layout) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        if (i == 0) {
            intValue = 0;
        } else {
            intValue = ((Number) arrayList.get(i - 1)).intValue();
        }
        int intValue2 = ((Number) arrayList.get(i)).intValue();
        int i3 = intValue2 - intValue;
        char[] cArr = (char[]) this.e;
        if (cArr == null || cArr.length < i3) {
            cArr = new char[i3];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i3)) {
            if (layout.getParagraphDirection(layout.getLineForOffset(z(i))) == -1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            bidi = new Bidi(cArr2, 0, null, 0, i3, i2);
        }
        bidi = null;
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.e;
            if (cArr2 == cArr3) {
                cArr2 = null;
            } else {
                cArr2 = cArr3;
            }
        }
        this.e = cArr2;
        return bidi;
    }

    public wy k() {
        String str;
        if (((ig1) this.a) == null) {
            str = " surface";
        } else {
            str = "";
        }
        if (((List) this.b) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.c) == null) {
            str = str.concat(" mirrorMode");
        }
        if (((Integer) this.d) == null) {
            str = str.concat(" surfaceGroupId");
        }
        if (((yq1) this.e) == null) {
            str = str.concat(" dynamicRange");
        }
        if (str.isEmpty()) {
            return new wy((ig1) this.a, (List) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (yq1) this.e);
        }
        i.m("Missing required properties:".concat(str));
        return null;
    }

    public void l(ma0 ma0Var) {
        ma0Var.getClass();
        String ma0Var2 = ma0Var.toString();
        if (ma0Var2.length() == 0) {
            ((ww2) this.c).r("Cache-Control");
        } else {
            B("Cache-Control", ma0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r2 == r5) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:16:0x003f, B:76:0x015c, B:78:0x0162, B:81:0x016c, B:82:0x0170, B:84:0x0176, B:23:0x0058, B:70:0x0144, B:72:0x014a, B:26:0x006d, B:55:0x0107, B:57:0x010b, B:67:0x0130, B:60:0x0113, B:61:0x0117, B:63:0x011d, B:51:0x00f5), top: B:102:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:16:0x003f, B:76:0x015c, B:78:0x0162, B:81:0x016c, B:82:0x0170, B:84:0x0176, B:23:0x0058, B:70:0x0144, B:72:0x014a, B:26:0x006d, B:55:0x0107, B:57:0x010b, B:67:0x0130, B:60:0x0113, B:61:0x0117, B:63:0x011d, B:51:0x00f5), top: B:102:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:16:0x003f, B:76:0x015c, B:78:0x0162, B:81:0x016c, B:82:0x0170, B:84:0x0176, B:23:0x0058, B:70:0x0144, B:72:0x014a, B:26:0x006d, B:55:0x0107, B:57:0x010b, B:67:0x0130, B:60:0x0113, B:61:0x0117, B:63:0x011d, B:51:0x00f5), top: B:102:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:16:0x003f, B:76:0x015c, B:78:0x0162, B:81:0x016c, B:82:0x0170, B:84:0x0176, B:23:0x0058, B:70:0x0144, B:72:0x014a, B:26:0x006d, B:55:0x0107, B:57:0x010b, B:67:0x0130, B:60:0x0113, B:61:0x0117, B:63:0x011d, B:51:0x00f5), top: B:102:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(pq5 pq5Var, s41 s41Var) {
        pw1 pw1Var;
        Object obj;
        int i;
        long j;
        lx5 lx5Var;
        pq5 pq5Var2;
        long j2;
        List list;
        Iterator it;
        int i2;
        pq5 pq5Var3;
        Object f;
        Iterable iterable;
        Iterator it2;
        pq5 pq5Var4 = pq5Var;
        fg fgVar = (fg) this.d;
        try {
            if (s41Var instanceof pw1) {
                pw1Var = (pw1) s41Var;
                int i3 = pw1Var.f0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    pw1Var.f0 = i3 - Integer.MIN_VALUE;
                    obj = pw1Var.d0;
                    Object obj2 = x61.COROUTINE_SUSPENDED;
                    i = pw1Var.f0;
                    boolean z = false;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 5) {
                                            j2 = pw1Var.Y;
                                            pq5Var3 = pw1Var.R;
                                            oi2.Y(obj);
                                            j = 4294967295L;
                                            iterable = (Iterable) obj;
                                            if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                                it2 = iterable.iterator();
                                                while (it2.hasNext()) {
                                                    if ((((DSiWareTitle) it2.next()).getTitleId() & j) == j2) {
                                                        z = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (z) {
                                                return new sx5(rx5.g);
                                            }
                                            return new vx5(pq5.a(pq5Var3, null, null, null, null, false, null, 0L, false, new Long(j2), 6143));
                                        }
                                        i.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    int i4 = pw1Var.Z;
                                    long j3 = pw1Var.Y;
                                    pq5 pq5Var5 = pw1Var.R;
                                    oi2.Y(obj);
                                    pq5Var2 = pq5Var5;
                                    j = 4294967295L;
                                    i2 = i4;
                                    j2 = j3;
                                    f = obj;
                                    if (((t33) f) != t33.SUCCESS) {
                                        pw1Var.R = pq5Var2;
                                        pw1Var.X = null;
                                        pw1Var.Y = j2;
                                        pw1Var.Z = i2;
                                        pw1Var.f0 = 5;
                                        obj = fgVar.h(pw1Var);
                                        if (obj != obj2) {
                                            pq5Var3 = pq5Var2;
                                            iterable = (Iterable) obj;
                                            if (iterable instanceof Collection) {
                                            }
                                            it2 = iterable.iterator();
                                            while (it2.hasNext()) {
                                            }
                                            if (z) {
                                            }
                                        } else {
                                            return obj2;
                                        }
                                    } else {
                                        pq5Var3 = pq5Var2;
                                        if (z) {
                                        }
                                    }
                                } else {
                                    j2 = pw1Var.Y;
                                    pq5Var2 = pw1Var.R;
                                    oi2.Y(obj);
                                    j = 4294967295L;
                                    list = (List) obj;
                                    if (list != null || !list.isEmpty()) {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            if ((((DSiWareTitle) it.next()).getTitleId() & j) == j2) {
                                                i2 = 1;
                                                break;
                                            }
                                        }
                                    }
                                    i2 = 0;
                                    if (i2 != 0) {
                                        Uri uri = pq5Var2.d;
                                        pw1Var.R = pq5Var2;
                                        pw1Var.X = null;
                                        pw1Var.Y = j2;
                                        pw1Var.Z = i2;
                                        pw1Var.f0 = 4;
                                        f = fgVar.f(uri, pw1Var);
                                        if (f == obj2) {
                                            return obj2;
                                        }
                                        if (((t33) f) != t33.SUCCESS) {
                                        }
                                    } else {
                                        pq5Var3 = pq5Var2;
                                        z = true;
                                        if (z) {
                                        }
                                    }
                                }
                            } else {
                                lx5Var = pw1Var.X;
                                pq5Var4 = pw1Var.R;
                                oi2.Y(obj);
                                j = 4294967295L;
                            }
                        } else {
                            oi2.Y(obj);
                            return obj;
                        }
                    } else {
                        oi2.Y(obj);
                        boolean c = pq5Var4.c();
                        Uri uri2 = pq5Var4.d;
                        if (!c) {
                            j = 4294967295L;
                            if (!nb3.k(uri2.getScheme(), "dsiware-installed")) {
                                pw5 b = ((mp) this.c).b(uri2);
                                if (b != null) {
                                    lx5Var = b.a(pq5Var4);
                                } else {
                                    lx5Var = null;
                                }
                                if (lx5Var == null) {
                                    return new sx5(rx5.f);
                                }
                                pw1Var.R = pq5Var4;
                                pw1Var.X = lx5Var;
                                pw1Var.f0 = 2;
                                obj = fgVar.i(pw1Var);
                            }
                        }
                        pw1Var.R = null;
                        pw1Var.f0 = 1;
                        Object o = o(pq5Var4, pw1Var);
                        if (o == obj2) {
                            return obj2;
                        }
                        return o;
                    }
                    if (!((mm4) obj).isFailure()) {
                        return new sx5(rx5.e);
                    }
                    long j4 = ByteBuffer.wrap(xs6.X(lx5Var.a)).order(ByteOrder.BIG_ENDIAN).getInt() & j;
                    pw1Var.R = pq5Var4;
                    pw1Var.X = null;
                    pw1Var.Y = j4;
                    pw1Var.f0 = 3;
                    obj = fgVar.h(pw1Var);
                    if (obj != obj2) {
                        pq5Var2 = pq5Var4;
                        j2 = j4;
                        list = (List) obj;
                        if (list != null) {
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        i2 = 0;
                        if (i2 != 0) {
                        }
                    } else {
                        return obj2;
                    }
                }
            }
            if (i == 0) {
            }
            if (!((mm4) obj).isFailure()) {
            }
        } finally {
            fgVar.b();
        }
        pw1Var = new pw1(this, s41Var);
        obj = pw1Var.d0;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = pw1Var.f0;
        boolean z2 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(ConsoleType consoleType, s41 s41Var) {
        qw1 qw1Var;
        int i;
        nw1 nw1Var;
        if (s41Var instanceof qw1) {
            qw1Var = (qw1) s41Var;
            int i2 = qw1Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qw1Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = qw1Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = qw1Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        consoleType = qw1Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    VideoRenderer e = ((ng6) ((kd6) this.e)).e();
                    qw1Var.R = consoleType;
                    qw1Var.Z = 1;
                    if (e != VideoRenderer.VULKAN) {
                        obj = null;
                    } else {
                        obj = hv.d0(xk1.a, new xd1(this, null, 4), qw1Var);
                    }
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                nw1Var = (nw1) obj;
                if (nw1Var == null) {
                    int i3 = ow1.a[nw1Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return new vc2(VideoRenderer.VULKAN);
                        }
                        i.d();
                        return null;
                    }
                    return new wc2(VideoRenderer.VULKAN);
                }
                dz0 b = ((fb2) this.b).b(consoleType);
                if (b.b != cz0.VALID) {
                    return new uc2(b);
                }
                return new xc2(consoleType);
            }
        }
        qw1Var = new qw1(this, s41Var);
        Object obj2 = qw1Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = qw1Var.Z;
        if (i == 0) {
        }
        nw1Var = (nw1) obj2;
        if (nw1Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r9 == r11) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:33:0x007b, B:35:0x0082, B:38:0x008d, B:39:0x0091, B:41:0x0097, B:29:0x006c), top: B:54:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002e, B:33:0x007b, B:35:0x0082, B:38:0x008d, B:39:0x0091, B:41:0x0097, B:29:0x006c), top: B:54:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(pq5 pq5Var, s41 s41Var) {
        rw1 rw1Var;
        Object obj;
        int i;
        long longValue;
        pq5 pq5Var2;
        long j;
        Iterable iterable;
        Iterator it;
        fg fgVar = (fg) this.d;
        try {
            if (s41Var instanceof rw1) {
                rw1Var = (rw1) s41Var;
                int i2 = rw1Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rw1Var.d0 = i2 - Integer.MIN_VALUE;
                    obj = rw1Var.Y;
                    Object obj2 = x61.COROUTINE_SUSPENDED;
                    i = rw1Var.d0;
                    boolean z = true;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                j = rw1Var.X;
                                pq5Var2 = rw1Var.R;
                                oi2.Y(obj);
                                iterable = (Iterable) obj;
                                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                    it = iterable.iterator();
                                    while (it.hasNext()) {
                                        if ((((DSiWareTitle) it.next()).getTitleId() & 4294967295L) == (4294967295L & j)) {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (z) {
                                    return new sx5(rx5.g);
                                }
                                return new vx5(pq5Var2);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        longValue = rw1Var.X;
                        pq5Var = rw1Var.R;
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        Long l = pq5Var.l;
                        if (l != null) {
                            longValue = l.longValue();
                            rw1Var.R = pq5Var;
                            rw1Var.X = longValue;
                            rw1Var.d0 = 1;
                            obj = fgVar.i(rw1Var);
                        } else {
                            return new sx5(rx5.f);
                        }
                    }
                    if (!((mm4) obj).isFailure()) {
                        return new sx5(rx5.e);
                    }
                    rw1Var.R = pq5Var;
                    rw1Var.X = longValue;
                    rw1Var.d0 = 2;
                    obj = fgVar.h(rw1Var);
                    if (obj != obj2) {
                        pq5Var2 = pq5Var;
                        j = longValue;
                        iterable = (Iterable) obj;
                        if (iterable instanceof Collection) {
                        }
                        it = iterable.iterator();
                        while (it.hasNext()) {
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    return obj2;
                }
            }
            if (i == 0) {
            }
            if (!((mm4) obj).isFailure()) {
            }
        } finally {
            fgVar.b();
        }
        rw1Var = new rw1(this, s41Var);
        obj = rw1Var.Y;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = rw1Var.d0;
        boolean z2 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r10 == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r10 == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(pq5 pq5Var, s41 s41Var) {
        sw1 sw1Var;
        int i;
        nw1 nw1Var;
        ng6 ng6Var;
        ConsoleType targetConsoleType;
        dz0 b;
        ConsoleType consoleType;
        kd6 kd6Var = (kd6) this.e;
        if (s41Var instanceof sw1) {
            sw1Var = (sw1) s41Var;
            int i2 = sw1Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sw1Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = sw1Var.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = sw1Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            wx5 wx5Var = (wx5) obj;
                            if (!(wx5Var instanceof vx5)) {
                                return wx5Var;
                            }
                            pq5Var = ((vx5) wx5Var).a;
                            ng6Var = (ng6) kd6Var;
                            if (ng6Var.Q() && pq5Var.f.a == u26.DEFAULT) {
                                b = new dz0(ConsoleType.DS, cz0.VALID, new String[0], new vr4[0]);
                            } else {
                                targetConsoleType = pq5Var.f.a.getTargetConsoleType();
                                if (targetConsoleType == null) {
                                    targetConsoleType = ng6Var.f();
                                }
                                if (ng6Var.Q() && targetConsoleType == (consoleType = ConsoleType.DS)) {
                                    b = new dz0(consoleType, cz0.VALID, new String[0], new vr4[0]);
                                } else {
                                    b = ((fb2) this.b).b(targetConsoleType);
                                }
                            }
                            if (b.b == cz0.VALID) {
                                return new qx5(b);
                            }
                            return new vx5(pq5Var);
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pq5Var = sw1Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    jt5 jt5Var = pq5Var.f;
                    ng6 ng6Var2 = (ng6) kd6Var;
                    jt5Var.getClass();
                    VideoRenderer J = ng6Var2.J(jt5Var.i, ng6Var2.e());
                    sw1Var.R = pq5Var;
                    sw1Var.Z = 1;
                    if (J != VideoRenderer.VULKAN) {
                        obj = null;
                    } else {
                        obj = hv.d0(xk1.a, new xd1(this, null, 4), sw1Var);
                    }
                }
                nw1Var = (nw1) obj;
                if (nw1Var == null) {
                    int i3 = ow1.a[nw1Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return new tx5(VideoRenderer.VULKAN);
                        }
                        i.d();
                        return null;
                    }
                    return new ux5(VideoRenderer.VULKAN);
                }
                if (pq5Var.h) {
                    sw1Var.R = null;
                    sw1Var.Z = 2;
                    obj = m(pq5Var, sw1Var);
                }
                ng6Var = (ng6) kd6Var;
                if (ng6Var.Q()) {
                }
                targetConsoleType = pq5Var.f.a.getTargetConsoleType();
                if (targetConsoleType == null) {
                }
                if (ng6Var.Q()) {
                }
                b = ((fb2) this.b).b(targetConsoleType);
                if (b.b == cz0.VALID) {
                }
            }
        }
        sw1Var = new sw1(this, s41Var);
        Object obj3 = sw1Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = sw1Var.Z;
        if (i == 0) {
        }
        nw1Var = (nw1) obj3;
        if (nw1Var == null) {
        }
    }

    public xc0 q(me0 me0Var, Map map, Map map2) {
        me0Var.getClass();
        map.getClass();
        map2.getClass();
        t57 t57Var = (t57) this.a;
        kf0 kf0Var = (kf0) this.b;
        int i = kf0Var.i;
        jr6 jr6Var = (jr6) this.c;
        ks6 ks6Var = (ks6) this.e;
        nd0 nd0Var = (nd0) this.d;
        nd0Var.getClass();
        nd0Var.b.getClass();
        kf0Var.o.getClass();
        kg0 kg0Var = lg0.g;
        lg0 d = nd0Var.a.d(kf0Var.a);
        kg0Var.getClass();
        return new xc0(me0Var, t57Var, i, map, map2, jr6Var, ks6Var, kg0.c(d));
    }

    public void r(eg0 eg0Var, eg0 eg0Var2, qv6 qv6Var, qv6 qv6Var2, Map.Entry entry) {
        eg0 eg0Var3;
        eg0 eg0Var4;
        qv6 qv6Var3 = (qv6) entry.getValue();
        kj2.t("DualSurfaceProcessorNode", "     -> outputEdge = " + qv6Var3);
        Size size = qv6Var.g.a;
        Rect rect = ((ay) entry.getKey()).a.d;
        if (qv6Var.c) {
            eg0Var3 = eg0Var;
        } else {
            eg0Var3 = null;
        }
        zy zyVar = new zy(size, rect, eg0Var3, ((ay) entry.getKey()).a.f, ((ay) entry.getKey()).a.g);
        Size size2 = qv6Var2.g.a;
        Rect rect2 = ((ay) entry.getKey()).b.d;
        if (qv6Var2.c) {
            eg0Var4 = eg0Var2;
        } else {
            eg0Var4 = null;
        }
        zy zyVar2 = new zy(size2, rect2, eg0Var4, ((ay) entry.getKey()).b.f, ((ay) entry.getKey()).b.g);
        int i = ((ay) entry.getKey()).a.c;
        qv6Var3.getClass();
        nj2.h();
        qv6Var3.a();
        np2.A("Consumer can only be linked once.", !qv6Var3.j);
        qv6Var3.j = true;
        pv6 pv6Var = qv6Var3.l;
        ll0 T = l.T(pv6Var.c(), new ov6(qv6Var3, pv6Var, i, zyVar, zyVar2), u24.x());
        T.a(u24.x(), new uo2(0, T, new yc1(this, qv6Var3, false)));
    }

    public rz6 s() {
        ArrayList arrayList = (ArrayList) this.e;
        Intent intent = (Intent) this.c;
        mc4 mc4Var = (mc4) this.d;
        if (mc4Var != null) {
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                int size = arrayList.size();
                ic4 ic4Var = null;
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    gc4 gc4Var = (gc4) obj;
                    int i2 = gc4Var.a;
                    Bundle bundle = gc4Var.b;
                    ic4 u = u(i2);
                    if (u != null) {
                        for (int i3 : u.b(ic4Var)) {
                            arrayList2.add(Integer.valueOf(i3));
                            arrayList3.add(bundle);
                        }
                        ic4Var = u;
                    } else {
                        int i4 = ic4.X;
                        fa6.f("Navigation destination ", mp2.C((rh) this.b, i2), " cannot be found in the navigation graph ", mc4Var);
                        return null;
                    }
                }
                intent.putExtra("android-support-nav:controller:deepLinkIds", gt0.j1(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                rz6 rz6Var = new rz6((Context) this.a);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(rz6Var.B.getPackageManager());
                }
                if (component != null) {
                    rz6Var.a(component);
                }
                ArrayList arrayList4 = rz6Var.A;
                arrayList4.add(intent2);
                int size2 = arrayList4.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Intent intent3 = (Intent) arrayList4.get(i5);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                }
                return rz6Var;
            }
            i.m("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        i.m("You must call setGraph() before constructing the deep link");
        return null;
    }

    public int t(int i) {
        ao4 ao4Var = ((xi3) this.e).n;
        short[] sArr = (short[]) this.a;
        if (ao4Var.a(sArr, 0) == 0) {
            return ao4Var.b(((short[][]) this.b)[i]) + 2;
        }
        if (ao4Var.a(sArr, 1) == 0) {
            return ao4Var.b(((short[][]) this.c)[i]) + 10;
        }
        return ao4Var.b((short[]) this.d) + 18;
    }

    public ic4 u(int i) {
        pu puVar = new pu();
        mc4 mc4Var = (mc4) this.d;
        mc4Var.getClass();
        puVar.addLast(mc4Var);
        while (!puVar.isEmpty()) {
            ic4 ic4Var = (ic4) puVar.removeFirst();
            if (ic4Var.B.a == i) {
                return ic4Var;
            }
            if (ic4Var instanceof mc4) {
                Iterator it = ((mc4) ic4Var).iterator();
                while (true) {
                    oc4 oc4Var = (oc4) it;
                    if (oc4Var.hasNext()) {
                        puVar.addLast((ic4) oc4Var.next());
                    }
                }
            }
        }
        return null;
    }

    public void v(qn2 qn2Var) {
        int i;
        synchronized (this.a) {
            try {
                ca4 ca4Var = (ca4) this.d;
                this.d = (ca4) this.e;
                this.e = ca4Var;
                vw vwVar = (vw) this.c;
                do {
                    i = vwVar.get();
                } while (!vwVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = ca4Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    qn2Var.g(ca4Var.f(i3));
                }
                ca4Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float w(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        if (z) {
            return layout.getPrimaryHorizontal(i);
        }
        return layout.getSecondaryHorizontal(i);
    }

    public float x(int i, boolean z, boolean z2) {
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return w(i, z);
        }
        int C = hi2.C(layout, i, z2);
        int lineStart = layout.getLineStart(C);
        int lineEnd = layout.getLineEnd(C);
        if (i != lineStart && i != lineEnd) {
            return w(i, z);
        }
        if (i != 0 && i != layout.getText().length()) {
            int y = y(i, z2);
            if (layout.getParagraphDirection(layout.getLineForOffset(z(y))) == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int C2 = C(lineEnd, lineStart);
            int z8 = z(y);
            int i5 = lineStart - z8;
            int i6 = C2 - z8;
            Bidi j = j(y);
            if (j != null) {
                bidi = j.createLineBidi(i5, i6);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                am3[] am3VarArr = new am3[runCount];
                for (int i7 = 0; i7 < runCount; i7++) {
                    int runStart = bidi.getRunStart(i7) + lineStart;
                    int runLimit = bidi.getRunLimit(i7) + lineStart;
                    if (bidi.getRunLevel(i7) % 2 == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    am3VarArr[i7] = new am3(runStart, z7, runLimit);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i8 = 0; i8 < runCount2; i8++) {
                    bArr[i8] = (byte) bidi.getRunLevel(i8);
                }
                Bidi.reorderVisually(bArr, 0, am3VarArr, 0, runCount);
                if (i == lineStart) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < runCount) {
                            if (am3VarArr[i9].a == i) {
                                i4 = i9;
                                break;
                            }
                            i9++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    am3 am3Var = am3VarArr[i4];
                    if (!z && z3 != am3Var.c) {
                        z6 = z3;
                    } else if (!z3) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i4 == 0 && z6) {
                        return layout.getLineLeft(C);
                    }
                    if (i4 == runCount - 1 && !z6) {
                        return layout.getLineRight(C);
                    }
                    if (z6) {
                        return layout.getPrimaryHorizontal(am3VarArr[i4 - 1].a);
                    }
                    return layout.getPrimaryHorizontal(am3VarArr[i4 + 1].a);
                }
                if (i > C2) {
                    i2 = C(i, lineStart);
                } else {
                    i2 = i;
                }
                int i10 = 0;
                while (true) {
                    if (i10 < runCount) {
                        if (am3VarArr[i10].b == i2) {
                            i3 = i10;
                            break;
                        }
                        i10++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                am3 am3Var2 = am3VarArr[i3];
                if (!z && z3 != am3Var2.c) {
                    if (!z3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = z3;
                }
                if (i3 == 0 && z5) {
                    return layout.getLineLeft(C);
                }
                if (i3 == runCount - 1 && !z5) {
                    return layout.getLineRight(C);
                }
                if (z5) {
                    return layout.getPrimaryHorizontal(am3VarArr[i3 - 1].b);
                }
                return layout.getPrimaryHorizontal(am3VarArr[i3 + 1].b);
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                if (!z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (i == lineStart) {
                z4 = z3;
            } else if (!z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return layout.getLineLeft(C);
            }
            return layout.getLineRight(C);
        }
        return w(i, z);
    }

    public int y(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.b;
        int y = hf.y(arrayList, Integer.valueOf(i));
        if (y < 0) {
            i2 = -(y + 1);
        } else {
            i2 = y + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int z(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public s9(jq jqVar, ax1 ax1Var) {
        this.a = jqVar;
        this.b = ax1Var;
        this.c = new uo7(gh5.a(vw1.class), new cx1(jqVar, 1), new cx1(jqVar, 0), new cx1(jqVar, 2));
        this.d = (i9) jqVar.s(new c9(5), new a9(this) { // from class: ww1
            public final /* synthetic */ s9 B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                int i = r2;
                s9 s9Var = this.B;
                z8 z8Var = (z8) obj;
                switch (i) {
                    case 0:
                        z8Var.getClass();
                        s9Var.A().e();
                        return;
                    default:
                        z8Var.getClass();
                        s9Var.A().e();
                        return;
                }
            }
        });
        this.e = (i9) jqVar.s(new c9(5), new a9(this) { // from class: ww1
            public final /* synthetic */ s9 B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                int i = r2;
                s9 s9Var = this.B;
                z8 z8Var = (z8) obj;
                switch (i) {
                    case 0:
                        z8Var.getClass();
                        s9Var.A().e();
                        return;
                    default:
                        z8Var.getClass();
                        s9Var.A().e();
                        return;
                }
            }
        });
        hv.L(bl2.C(jqVar), null, null, new zw1(this, null, 1), 3);
    }

    public s9(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new gv0(this, 4);
    }

    public s9(int i) {
        switch (i) {
            case 13:
                this.e = eu1.b;
                this.b = "GET";
                this.c = new ww2(0, (byte) 0);
                return;
            default:
                this.a = new Object();
                this.c = new AtomicInteger(0);
                this.d = new ca4();
                this.e = new ca4();
                return;
        }
    }

    public /* synthetic */ s9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public s9(rc4 rc4Var) {
        Intent launchIntentForPackage;
        rc4Var.getClass();
        Context context = rc4Var.a;
        context.getClass();
        this.a = context;
        this.b = new rh(context, (byte) 0);
        oc2 oc2Var = new oc2(sb6.b0(sb6.Z(context, new x84(8)), new x84(9)));
        Activity activity = (Activity) (!oc2Var.hasNext() ? null : oc2Var.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.c = launchIntentForPackage;
        this.e = new ArrayList();
        this.d = rc4Var.b.g();
    }

    public s9(xi3 xi3Var) {
        this.e = xi3Var;
        this.a = new short[2];
        Class cls = Short.TYPE;
        this.b = (short[][]) Array.newInstance(cls, 16, 8);
        this.c = (short[][]) Array.newInstance(cls, 16, 8);
        this.d = new short[256];
    }
}
