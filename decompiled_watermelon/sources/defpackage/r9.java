package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r9  reason: default package */
/* loaded from: classes.dex */
public final class r9 implements yi4 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    public r9(to toVar, ds6 ds6Var, List list, od1 od1Var, od2 od2Var) {
        List list2;
        int i;
        String str;
        String str2;
        int i2;
        pp1 pp1Var;
        List list3;
        to toVar2 = toVar;
        ds6 ds6Var2 = ds6Var;
        this.a = toVar2;
        this.b = list;
        wk3 wk3Var = wk3.NONE;
        int i3 = 0;
        this.c = yf2.H(wk3Var, new ki2(this) { // from class: r04
            public final /* synthetic */ r9 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.ki2
            public final Object c() {
                int i4 = r2;
                float f = RecyclerView.A1;
                xi4 xi4Var = null;
                int i5 = 1;
                r9 r9Var = this.B;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) r9Var.e;
                        if (!arrayList.isEmpty()) {
                            Object obj = arrayList.get(0);
                            float a = ((xi4) obj).a.a();
                            int size = arrayList.size() - 1;
                            Object obj2 = obj;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float a2 = ((xi4) obj3).a.a();
                                    obj = obj2;
                                    if (Float.compare(a, a2) < 0) {
                                        obj = obj3;
                                        a = a2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        obj2 = obj;
                                    }
                                }
                            }
                            xi4Var = obj;
                        }
                        xi4 xi4Var2 = xi4Var;
                        if (xi4Var2 != null) {
                            f = xi4Var2.a.a();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) r9Var.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float c = ((xi4) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            Object obj5 = obj4;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float c2 = ((xi4) obj6).a.i.c();
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
                            xi4Var = obj4;
                        }
                        xi4 xi4Var3 = xi4Var;
                        if (xi4Var3 != null) {
                            f = xi4Var3.a.i.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        this.d = yf2.H(wk3Var, new ki2(this) { // from class: r04
            public final /* synthetic */ r9 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.ki2
            public final Object c() {
                int i4 = r2;
                float f = RecyclerView.A1;
                xi4 xi4Var = null;
                int i5 = 1;
                r9 r9Var = this.B;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) r9Var.e;
                        if (!arrayList.isEmpty()) {
                            Object obj = arrayList.get(0);
                            float a = ((xi4) obj).a.a();
                            int size = arrayList.size() - 1;
                            Object obj2 = obj;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float a2 = ((xi4) obj3).a.a();
                                    obj = obj2;
                                    if (Float.compare(a, a2) < 0) {
                                        obj = obj3;
                                        a = a2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                        obj2 = obj;
                                    }
                                }
                            }
                            xi4Var = obj;
                        }
                        xi4 xi4Var2 = xi4Var;
                        if (xi4Var2 != null) {
                            f = xi4Var2.a.a();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) r9Var.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float c = ((xi4) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            Object obj5 = obj4;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float c2 = ((xi4) obj6).a.i.c();
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
                            xi4Var = obj4;
                        }
                        xi4 xi4Var3 = xi4Var;
                        if (xi4Var3 != null) {
                            f = xi4Var3.a.i.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        bj4 bj4Var = ds6Var2.b;
        to toVar3 = uo.a;
        ArrayList arrayList = toVar2.R;
        String str3 = toVar2.B;
        pp1 pp1Var2 = pp1.A;
        if (arrayList != null) {
            list2 = tq0.g1(arrayList, new hd2(8));
        } else {
            list2 = pp1Var2;
        }
        ArrayList arrayList2 = new ArrayList();
        xt xtVar = new xt();
        int size = list2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            so soVar = (so) list2.get(i4);
            so a = so.a(soVar, bj4Var.a((bj4) soVar.a), i3, 14);
            Object obj = a.a;
            int i6 = a.c;
            int i7 = a.b;
            while (i5 < i7 && !xtVar.isEmpty()) {
                so soVar2 = (so) xtVar.last();
                List list4 = list2;
                int i8 = soVar2.c;
                pp1 pp1Var3 = pp1Var2;
                Object obj2 = soVar2.a;
                if (i7 < i8) {
                    arrayList2.add(new so(i5, i7, obj2));
                    i5 = i7;
                    list2 = list4;
                    pp1Var2 = pp1Var3;
                } else {
                    int i9 = size;
                    arrayList2.add(new so(i5, i8, obj2));
                    i5 = soVar2.c;
                    while (!xtVar.isEmpty() && i5 == ((so) xtVar.last()).c) {
                        xtVar.removeLast();
                    }
                    list2 = list4;
                    pp1Var2 = pp1Var3;
                    size = i9;
                }
            }
            List list5 = list2;
            pp1 pp1Var4 = pp1Var2;
            int i10 = size;
            if (i5 < i7) {
                arrayList2.add(new so(i5, i7, bj4Var));
                i5 = i7;
            }
            so soVar3 = (so) xtVar.l();
            if (soVar3 != null) {
                int i11 = soVar3.c;
                Object obj3 = soVar3.a;
                int i12 = soVar3.b;
                if (i12 == i7 && i11 == i6) {
                    xtVar.removeLast();
                    xtVar.addLast(new so(i7, i6, ((bj4) obj3).a((bj4) obj)));
                } else if (i12 == i11) {
                    arrayList2.add(new so(i12, i11, obj3));
                    xtVar.removeLast();
                    xtVar.addLast(new so(i7, i6, obj));
                } else if (i11 >= i6) {
                    xtVar.addLast(new so(i7, i6, ((bj4) obj3).a((bj4) obj)));
                } else {
                    c44.r();
                    throw null;
                }
            } else {
                xtVar.addLast(new so(i7, i6, obj));
            }
            i4++;
            list2 = list5;
            pp1Var2 = pp1Var4;
            size = i10;
            i3 = 0;
        }
        pp1 pp1Var5 = pp1Var2;
        while (i5 <= str3.length() && !xtVar.isEmpty()) {
            so soVar4 = (so) xtVar.last();
            Object obj4 = soVar4.a;
            int i13 = soVar4.c;
            arrayList2.add(new so(i5, i13, obj4));
            while (!xtVar.isEmpty() && i13 == ((so) xtVar.last()).c) {
                xtVar.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str3.length()) {
            arrayList2.add(new so(i5, str3.length(), bj4Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new so(0, 0, bj4Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = i;
        while (i14 < size2) {
            so soVar5 = (so) arrayList2.get(i14);
            int i15 = soVar5.b;
            int i16 = soVar5.c;
            if (i15 != i16) {
                str = str3.substring(i15, i16);
            } else {
                str = "";
            }
            List a2 = uo.a(toVar2, i15, i16, new k4(11));
            to toVar4 = new to(str, a2 == null ? pp1Var5 : a2);
            bj4 bj4Var2 = (bj4) soVar5.a;
            if (bj4Var2.b == 0) {
                str2 = str3;
                i2 = size2;
                bj4Var2 = new bj4(bj4Var2.a, bj4Var.b, bj4Var2.c, bj4Var2.d, bj4Var2.e, bj4Var2.f, bj4Var2.g, bj4Var2.h, bj4Var2.i);
            } else {
                str2 = str3;
                i2 = size2;
            }
            ds6 ds6Var3 = new ds6(ds6Var2.a, bj4Var.a(bj4Var2));
            ?? r5 = toVar4.A;
            if (r5 == 0) {
                pp1Var = pp1Var5;
            } else {
                pp1Var = r5;
            }
            List list6 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                so soVar6 = (so) list6.get(i17);
                int i18 = soVar6.b;
                bj4 bj4Var3 = bj4Var;
                int i19 = soVar6.c;
                if (uo.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        nz2.a("placeholder can not overlap with paragraph.");
                    }
                    list3 = list6;
                    arrayList4.add(new so(i18 - i15, i19 - i15, soVar6.a));
                } else {
                    list3 = list6;
                }
                i17++;
                list6 = list3;
                bj4Var = bj4Var3;
            }
            arrayList3.add(new xi4(new ui(str, ds6Var3, pp1Var, arrayList4, od2Var, od1Var), i15, i16));
            i14++;
            toVar2 = toVar;
            ds6Var2 = ds6Var;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.p31 d(defpackage.r9 r7, defpackage.k11 r8) {
        /*
            java.lang.Object r0 = r7.d
            q60 r0 = (defpackage.q60) r0
            java.lang.Object r1 = r7.e
            xt r1 = (defpackage.xt) r1
            boolean r2 = r8 instanceof defpackage.iu4
            if (r2 == 0) goto L1b
            r2 = r8
            iu4 r2 = (defpackage.iu4) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.Z = r3
            goto L20
        L1b:
            iu4 r2 = new iu4
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.X
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L36
            int r4 = r2.R
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L34
            goto L7d
        L34:
            r8 = move-exception
            goto L82
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L3d:
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L34
            goto L50
        L41:
            defpackage.me2.a0(r8)
        L44:
            r2.Z = r6     // Catch: java.lang.Throwable -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = defpackage.q60.L(r0, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L50
            goto L7c
        L50:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L53:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L44
            java.lang.Object r8 = r0.o()     // Catch: java.lang.Throwable -> L34
        L5d:
            boolean r4 = r8 instanceof defpackage.wj0     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L6c
            defpackage.xj0.b(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.o()     // Catch: java.lang.Throwable -> L34
            goto L5d
        L6c:
            int r4 = r1.L     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> L34
            h4 r8 = (defpackage.h4) r8     // Catch: java.lang.Throwable -> L34
            r2.R = r4     // Catch: java.lang.Throwable -> L34
            r2.Z = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.j(r1, r2)     // Catch: java.lang.Throwable -> L34
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9.d(r9, k11):p31");
    }

    public static final void e(r9 r9Var, VideoRenderer videoRenderer) {
        String str;
        xp xpVar = (xp) r9Var.a;
        int i = ps1.a[videoRenderer.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "Compute";
                    } else {
                        i.c();
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
        sb sbVar = new sb(xpVar);
        pb pbVar = (pb) sbVar.L;
        sbVar.A(R.string.renderer_init_failed_title);
        pbVar.f = xpVar.getString(R.string.renderer_init_failed_message, str);
        sbVar.z(R.string.settings, new ls1(r9Var, 10));
        sbVar.x(R.string.cancel, new ls1(r9Var, 0));
        pbVar.n = new ms1(r9Var, 0);
        sbVar.C();
    }

    public static final void f(r9 r9Var, VideoRenderer videoRenderer) {
        String str;
        xp xpVar = (xp) r9Var.a;
        int i = ps1.a[videoRenderer.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "Compute";
                    } else {
                        i.c();
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
        sb sbVar = new sb(xpVar);
        pb pbVar = (pb) sbVar.L;
        sbVar.A(R.string.renderer_unsupported_title);
        pbVar.f = xpVar.getString(R.string.renderer_unsupported_message, str);
        sbVar.z(R.string.settings, new ls1(r9Var, 3));
        sbVar.x(R.string.cancel, new ls1(r9Var, 4));
        pbVar.n = new ms1(r9Var, 2);
        sbVar.C();
    }

    public js1 A() {
        return (js1) ((va7) this.c).getValue();
    }

    public void B(String str, String str2) {
        str2.getClass();
        vq2 vq2Var = (vq2) this.c;
        vq2Var.getClass();
        ie7.b(str);
        ie7.c(str2, str);
        vq2Var.r(str);
        ie7.a(vq2Var, str, str2);
    }

    public int C(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.a).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((b53.E(charAt, 8192) < 0 || b53.E(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void D(String str, ua5 ua5Var) {
        str.getClass();
        if (str.length() > 0) {
            if (ua5Var == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                    i.g(wh1.A("method ", str, " must have a request body."));
                    return;
                }
            } else if (!sn2.K(str)) {
                i.g(wh1.A("method ", str, " must not have a request body."));
                return;
            }
            this.b = str;
            this.d = ua5Var;
            return;
        }
        i.i("method.isEmpty() == true");
    }

    public void E(Throwable th) {
        xt xtVar = (xt) this.e;
        q60 q60Var = (q60) this.d;
        if (q60Var.l(th, false)) {
            for (Object o = q60Var.o(); !(o instanceof wj0); o = q60Var.o()) {
                xj0.b(o);
                xtVar.addLast(o);
            }
            if (!xtVar.isEmpty()) {
                ((mi2) this.a).n(new ArrayList(xtVar));
                xtVar.clear();
            }
        }
    }

    public void F() {
        ze4.e((short[]) this.a);
        int i = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = (short[][]) this.b;
            if (i2 >= sArr.length) {
                break;
            }
            ze4.e(sArr[i2]);
            i2++;
        }
        while (true) {
            short[][] sArr2 = (short[][]) this.c;
            if (i < sArr2.length) {
                ze4.e(sArr2[i]);
                i++;
            } else {
                ze4.e((short[]) this.d);
                return;
            }
        }
    }

    public void G(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        ee6 ee6Var = (ee6) ((LinkedHashMap) this.c).get(str);
        if (ee6Var != null) {
            ee6Var.k(obj);
        }
        ee6 ee6Var2 = (ee6) ((LinkedHashMap) this.d).get(str);
        if (ee6Var2 != null) {
            ee6Var2.k(obj);
        }
    }

    public boolean H(um2 um2Var) {
        return !(((q60) this.d).c(um2Var) instanceof wj0);
    }

    public void I(String str) {
        str.getClass();
        if (gh6.n0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (gh6.n0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        gu2 gu2Var = new gu2(0);
        gu2Var.e(null, str);
        this.a = gu2Var.b();
    }

    public void J() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((z34) obj).a;
            if (u(i2) == null) {
                int i3 = b44.X;
                i.j(b31.u("Navigation destination ", jk2.y((fh) this.b, i2), " cannot be found in the navigation graph "), (g44) this.d);
                return;
            }
        }
    }

    @Override // defpackage.yi4
    public float a() {
        return ((Number) ((gh3) this.c).getValue()).floatValue();
    }

    @Override // defpackage.yi4
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xi4) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yi4
    public float c() {
        return ((Number) ((gh3) this.d).getValue()).floatValue();
    }

    public void g(l70 l70Var, Class cls) {
        ((ArrayList) this.b).add(new ti4(l70Var, cls));
    }

    public void h(r52 r52Var, Class cls) {
        ((ArrayList) this.d).add(new ti4(r52Var, cls));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l75] */
    public kh0 i(ey eyVar, ki2 ki2Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        ?? obj = new Object();
        obj.A = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                eyVar.b(th);
                return sn1.X;
            }
            dw dwVar = (dw) this.c;
            do {
                i = dwVar.get();
                i2 = i + 1;
            } while (!dwVar.compareAndSet(i, i2));
            if ((134217727 & i2) == 1) {
                z = true;
            } else {
                z = false;
            }
            obj.A = (i2 >>> 27) & 15;
            ((w14) this.d).a(eyVar);
            if (z && ki2Var != null) {
                try {
                    ki2Var.c();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                w14 w14Var = (w14) this.d;
                                Object[] objArr = w14Var.a;
                                int i4 = w14Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((ey) objArr[i5]).b(th2);
                                }
                                ((w14) this.d).d();
                                dw dwVar2 = (dw) this.c;
                                do {
                                    i3 = dwVar2.get();
                                } while (!dwVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new ci3(new t6(eyVar, this, (Object) obj, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r6.getRunCount() == 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi j(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.z(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9.j(int):java.text.Bidi");
    }

    public hx k() {
        String str;
        if (((hc1) this.a) == null) {
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
        if (((sm1) this.e) == null) {
            str = str.concat(" dynamicRange");
        }
        if (str.isEmpty()) {
            return new hx((hc1) this.a, (List) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (sm1) this.e);
        }
        i.n("Missing required properties:".concat(str));
        return null;
    }

    public void l(e80 e80Var) {
        e80Var.getClass();
        String e80Var2 = e80Var.toString();
        if (e80Var2.length() == 0) {
            ((vq2) this.c).r("Cache-Control");
        } else {
            B("Cache-Control", e80Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r12 == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(defpackage.rg5 r11, defpackage.k11 r12) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9.m(rg5, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(me.magnum.melonds.domain.model.ConsoleType r7, defpackage.k11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.es1
            if (r0 == 0) goto L13
            r0 = r8
            es1 r0 = (defpackage.es1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            es1 r0 = new es1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            me.magnum.melonds.domain.model.ConsoleType r7 = r0.R
            defpackage.me2.a0(r8)
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L30:
            defpackage.me2.a0(r8)
            java.lang.Object r8 = r6.e
            w16 r8 = (defpackage.w16) r8
            b56 r8 = (defpackage.b56) r8
            me.magnum.melonds.domain.model.VideoRenderer r8 = r8.e()
            r0.R = r7
            r0.Z = r4
            me.magnum.melonds.domain.model.VideoRenderer r2 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r8 == r2) goto L47
            r8 = r3
            goto L53
        L47:
            bb1 r8 = defpackage.tg1.a
            ba1 r2 = new ba1
            r5 = 4
            r2.<init>(r6, r3, r5)
            java.lang.Object r8 = defpackage.tq5.G(r8, r2, r0)
        L53:
            if (r8 != r1) goto L56
            return r1
        L56:
            bs1 r8 = (defpackage.bs1) r8
            if (r8 == 0) goto L7b
            int[] r6 = defpackage.cs1.a
            int r7 = r8.ordinal()
            r6 = r6[r7]
            if (r6 == r4) goto L73
            r7 = 2
            if (r6 != r7) goto L6f
            d82 r6 = new d82
            me.magnum.melonds.domain.model.VideoRenderer r7 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r6.<init>(r7)
            return r6
        L6f:
            defpackage.i.c()
            return r3
        L73:
            e82 r6 = new e82
            me.magnum.melonds.domain.model.VideoRenderer r7 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r6.<init>(r7)
            return r6
        L7b:
            java.lang.Object r6 = r6.b
            l62 r6 = (defpackage.l62) r6
            hw0 r6 = r6.b(r7)
            gw0 r8 = r6.b
            gw0 r0 = defpackage.gw0.VALID
            if (r8 == r0) goto L8f
            c82 r7 = new c82
            r7.<init>(r6)
            return r7
        L8f:
            f82 r6 = new f82
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9.n(me.magnum.melonds.domain.model.ConsoleType, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(defpackage.rg5 r10, defpackage.k11 r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            qf r0 = (defpackage.qf) r0
            boolean r1 = r11 instanceof defpackage.fs1
            if (r1 == 0) goto L17
            r1 = r11
            fs1 r1 = (defpackage.fs1) r1
            int r2 = r1.c0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.c0 = r2
            goto L1c
        L17:
            fs1 r1 = new fs1
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r9 = r1.Y
            p31 r11 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r1.c0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L35
            long r10 = r1.X
            rg5 r1 = r1.R
            defpackage.me2.a0(r9)     // Catch: java.lang.Throwable -> L32
            goto L7b
        L32:
            r9 = move-exception
            goto Lbf
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            r9 = 0
            return r9
        L3c:
            long r5 = r1.X
            rg5 r10 = r1.R
            defpackage.me2.a0(r9)
            goto L5c
        L44:
            defpackage.me2.a0(r9)
            java.lang.Long r9 = r10.l
            if (r9 == 0) goto Lc3
            long r5 = r9.longValue()
            r1.R = r10
            r1.X = r5
            r1.c0 = r4
            java.lang.Enum r9 = r0.m(r1)
            if (r9 != r11) goto L5c
            goto L78
        L5c:
            ld4 r9 = (defpackage.ld4) r9
            boolean r9 = r9.isFailure()
            if (r9 == 0) goto L6c
            dn5 r9 = new dn5
            cn5 r10 = defpackage.cn5.e
            r9.<init>(r10)
            return r9
        L6c:
            r1.R = r10     // Catch: java.lang.Throwable -> L32
            r1.X = r5     // Catch: java.lang.Throwable -> L32
            r1.c0 = r3     // Catch: java.lang.Throwable -> L32
            java.io.Serializable r9 = r0.l(r1)     // Catch: java.lang.Throwable -> L32
            if (r9 != r11) goto L79
        L78:
            return r11
        L79:
            r1 = r10
            r10 = r5
        L7b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L32
            boolean r2 = r9 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 == 0) goto L8d
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L8d
        L8b:
            r4 = r3
            goto Lac
        L8d:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L32
        L91:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L32
            me.magnum.melonds.domain.model.DSiWareTitle r2 = (me.magnum.melonds.domain.model.DSiWareTitle) r2     // Catch: java.lang.Throwable -> L32
            long r5 = r2.getTitleId()     // Catch: java.lang.Throwable -> L32
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r7 = r7 & r10
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L91
        Lac:
            r0.d()
            if (r4 != 0) goto Lb9
            dn5 r9 = new dn5
            cn5 r10 = defpackage.cn5.g
            r9.<init>(r10)
            return r9
        Lb9:
            gn5 r9 = new gn5
            r9.<init>(r1)
            return r9
        Lbf:
            r0.d()
            throw r9
        Lc3:
            dn5 r9 = new dn5
            cn5 r10 = defpackage.cn5.f
            r9.<init>(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9.o(rg5, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r10 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r10 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(defpackage.rg5 r9, defpackage.k11 r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9.p(rg5, k11):java.lang.Object");
    }

    public pa0 q(dc0 dc0Var, Map map, Map map2) {
        dc0Var.getClass();
        map.getClass();
        map2.getClass();
        ct6 ct6Var = (ct6) this.a;
        bd0 bd0Var = (bd0) this.b;
        int i = bd0Var.i;
        tf6 tf6Var = (tf6) this.c;
        tg6 tg6Var = (tg6) this.e;
        fb0 fb0Var = (fb0) this.d;
        fb0Var.getClass();
        fb0Var.b.getClass();
        bd0Var.o.getClass();
        be0 be0Var = ce0.g;
        ce0 d = fb0Var.a.d(bd0Var.a);
        be0Var.getClass();
        return new pa0(dc0Var, ct6Var, i, map, map2, tf6Var, tg6Var, be0.c(d));
    }

    public void r(vd0 vd0Var, vd0 vd0Var2, wj6 wj6Var, wj6 wj6Var2, Map.Entry entry) {
        vd0 vd0Var3;
        vd0 vd0Var4;
        wj6 wj6Var3 = (wj6) entry.getValue();
        ve2.v("DualSurfaceProcessorNode", "     -> outputEdge = " + wj6Var3);
        Size size = wj6Var.g.a;
        Rect rect = ((ww) entry.getKey()).a.d;
        if (wj6Var.c) {
            vd0Var3 = vd0Var;
        } else {
            vd0Var3 = null;
        }
        kx kxVar = new kx(size, rect, vd0Var3, ((ww) entry.getKey()).a.f, ((ww) entry.getKey()).a.g);
        Size size2 = wj6Var2.g.a;
        Rect rect2 = ((ww) entry.getKey()).b.d;
        if (wj6Var2.c) {
            vd0Var4 = vd0Var2;
        } else {
            vd0Var4 = null;
        }
        kx kxVar2 = new kx(size2, rect2, vd0Var4, ((ww) entry.getKey()).b.f, ((ww) entry.getKey()).b.g);
        int i = ((ww) entry.getKey()).a.c;
        wj6Var3.getClass();
        nk2.s();
        wj6Var3.a();
        nl2.D("Consumer can only be linked once.", !wj6Var3.j);
        wj6Var3.j = true;
        vj6 vj6Var = wj6Var3.l;
        cj0 f0 = jv3.f0(vj6Var.c(), new uj6(wj6Var3, vj6Var, i, kxVar, kxVar2), iq2.x());
        f0.a(new qj2(0, f0, new k91((Object) this, (Object) wj6Var3, false)), iq2.x());
    }

    public gn6 s() {
        ArrayList arrayList = (ArrayList) this.e;
        Intent intent = (Intent) this.c;
        g44 g44Var = (g44) this.d;
        if (g44Var != null) {
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                int size = arrayList.size();
                b44 b44Var = null;
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    z34 z34Var = (z34) obj;
                    int i2 = z34Var.a;
                    Bundle bundle = z34Var.b;
                    b44 u = u(i2);
                    if (u != null) {
                        for (int i3 : u.c(b44Var)) {
                            arrayList2.add(Integer.valueOf(i3));
                            arrayList3.add(bundle);
                        }
                        b44Var = u;
                    } else {
                        int i4 = b44.X;
                        vd6.g("Navigation destination ", jk2.y((fh) this.b, i2), " cannot be found in the navigation graph ", g44Var);
                        return null;
                    }
                }
                intent.putExtra("android-support-nav:controller:deepLinkIds", tq0.m1(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                gn6 gn6Var = new gn6((Context) this.a);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(gn6Var.B.getPackageManager());
                }
                if (component != null) {
                    gn6Var.b(component);
                }
                ArrayList arrayList4 = gn6Var.A;
                arrayList4.add(intent2);
                int size2 = arrayList4.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Intent intent3 = (Intent) arrayList4.get(i5);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                }
                return gn6Var;
            }
            i.n("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        i.n("You must call setGraph() before constructing the deep link");
        return null;
    }

    public int t(int i) {
        ze4 ze4Var = ((fc3) this.e).n;
        short[] sArr = (short[]) this.a;
        if (ze4Var.a(sArr, 0) == 0) {
            return ze4Var.b(((short[][]) this.b)[i]) + 2;
        }
        if (ze4Var.a(sArr, 1) == 0) {
            return ze4Var.b(((short[][]) this.c)[i]) + 10;
        }
        return ze4Var.b((short[]) this.d) + 18;
    }

    public b44 u(int i) {
        xt xtVar = new xt();
        g44 g44Var = (g44) this.d;
        g44Var.getClass();
        xtVar.addLast(g44Var);
        while (!xtVar.isEmpty()) {
            b44 b44Var = (b44) xtVar.removeFirst();
            if (b44Var.B.a == i) {
                return b44Var;
            }
            if (b44Var instanceof g44) {
                Iterator it = ((g44) b44Var).iterator();
                while (true) {
                    i44 i44Var = (i44) it;
                    if (i44Var.hasNext()) {
                        xtVar.addLast((b44) i44Var.next());
                    }
                }
            }
        }
        return null;
    }

    public void v(mi2 mi2Var) {
        int i;
        synchronized (this.a) {
            try {
                w14 w14Var = (w14) this.d;
                this.d = (w14) this.e;
                this.e = w14Var;
                dw dwVar = (dw) this.c;
                do {
                    i = dwVar.get();
                } while (!dwVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = w14Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    mi2Var.n(w14Var.f(i3));
                }
                w14Var.d();
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
        int C = io2.C(layout, i, z2);
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
                df3[] df3VarArr = new df3[runCount];
                for (int i7 = 0; i7 < runCount; i7++) {
                    int runStart = bidi.getRunStart(i7) + lineStart;
                    int runLimit = bidi.getRunLimit(i7) + lineStart;
                    if (bidi.getRunLevel(i7) % 2 == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    df3VarArr[i7] = new df3(runStart, z7, runLimit);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i8 = 0; i8 < runCount2; i8++) {
                    bArr[i8] = (byte) bidi.getRunLevel(i8);
                }
                Bidi.reorderVisually(bArr, 0, df3VarArr, 0, runCount);
                if (i == lineStart) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < runCount) {
                            if (df3VarArr[i9].a == i) {
                                i4 = i9;
                                break;
                            }
                            i9++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    df3 df3Var = df3VarArr[i4];
                    if (!z && z3 != df3Var.c) {
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
                        return layout.getPrimaryHorizontal(df3VarArr[i4 - 1].a);
                    }
                    return layout.getPrimaryHorizontal(df3VarArr[i4 + 1].a);
                }
                if (i > C2) {
                    i2 = C(i, lineStart);
                } else {
                    i2 = i;
                }
                int i10 = 0;
                while (true) {
                    if (i10 < runCount) {
                        if (df3VarArr[i10].b == i2) {
                            i3 = i10;
                            break;
                        }
                        i10++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                df3 df3Var2 = df3VarArr[i3];
                if (!z && z3 != df3Var2.c) {
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
                    return layout.getPrimaryHorizontal(df3VarArr[i3 - 1].b);
                }
                return layout.getPrimaryHorizontal(df3VarArr[i3 + 1].b);
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
        int r = l07.r(arrayList, Integer.valueOf(i));
        if (r < 0) {
            i2 = -(r + 1);
        } else {
            i2 = r + 1;
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

    public r9(xp xpVar, os1 os1Var) {
        this.a = xpVar;
        this.b = os1Var;
        this.c = new va7(q75.a(js1.class), new qs1(xpVar, 1), new qs1(xpVar, 0), new qs1(xpVar, 2));
        this.d = (h9) xpVar.s(new b9(4), new z8(this) { // from class: ks1
            public final /* synthetic */ r9 B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                int i = r2;
                r9 r9Var = this.B;
                y8 y8Var = (y8) obj;
                switch (i) {
                    case 0:
                        y8Var.getClass();
                        r9Var.A().e();
                        return;
                    default:
                        y8Var.getClass();
                        r9Var.A().e();
                        return;
                }
            }
        });
        this.e = (h9) xpVar.s(new b9(4), new z8(this) { // from class: ks1
            public final /* synthetic */ r9 B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                int i = r2;
                r9 r9Var = this.B;
                y8 y8Var = (y8) obj;
                switch (i) {
                    case 0:
                        y8Var.getClass();
                        r9Var.A().e();
                        return;
                    default:
                        y8Var.getClass();
                        r9Var.A().e();
                        return;
                }
            }
        });
        tq5.w(hk2.y(xpVar), null, null, new ns1(this, null, 1), 3);
    }

    public r9(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ss0(4, this);
    }

    public r9(int i) {
        switch (i) {
            case 13:
                this.e = vp1.j;
                this.b = "GET";
                this.c = new vq2(0, (byte) 0);
                return;
            default:
                this.a = new Object();
                this.c = new AtomicInteger(0);
                this.d = new w14();
                this.e = new w14();
                return;
        }
    }

    public /* synthetic */ r9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public r9(l44 l44Var) {
        Intent launchIntentForPackage;
        l44Var.getClass();
        Context context = l44Var.a;
        context.getClass();
        this.a = context;
        this.b = new fh(context, (byte) 0);
        v72 v72Var = new v72(d06.z0(d06.x0(context, new gi3(26)), new gi3(27)));
        Activity activity = (Activity) (!v72Var.hasNext() ? null : v72Var.next());
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
        this.d = l44Var.b.g();
    }

    public r9(fc3 fc3Var) {
        this.e = fc3Var;
        this.a = new short[2];
        Class cls = Short.TYPE;
        this.b = (short[][]) Array.newInstance(cls, 16, 8);
        this.c = (short[][]) Array.newInstance(cls, 16, 8);
        this.d = new short[256];
    }
}
