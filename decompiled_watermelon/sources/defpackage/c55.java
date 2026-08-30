package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c55  reason: default package */
/* loaded from: classes.dex */
public final class c55 {
    public final Context a;
    public final ab1 b;
    public final il6 c;
    public final iw2 d;
    public final g11 e;
    public final ci3 f;
    public final ct0 g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r5v0, types: [r9, java.lang.Object] */
    public c55(Context context, ab1 ab1Var, il6 il6Var, il6 il6Var2, il6 il6Var3, ct0 ct0Var, iw2 iw2Var) {
        this.a = context;
        this.b = ab1Var;
        this.c = il6Var;
        this.d = iw2Var;
        mi6 c = hi2.c();
        bb1 bb1Var = tg1.a;
        this.e = iq2.c(se.O(c, bt3.a.Y).C(new td2(this)));
        nl6 nl6Var = new nl6(this);
        ci3 ci3Var = new ci3(this, nl6Var);
        this.f = ci3Var;
        ?? obj = new Object();
        obj.a = tq0.p1(ct0Var.a);
        obj.b = tq0.p1(ct0Var.b);
        obj.c = tq0.p1(ct0Var.c);
        obj.d = tq0.p1(ct0Var.d);
        obj.e = tq0.p1(ct0Var.e);
        obj.g(new l70(3), hu2.class);
        obj.g(new l70(6), String.class);
        obj.g(new l70(2), Uri.class);
        obj.g(new l70(5), Uri.class);
        obj.g(new l70(4), Integer.class);
        obj.g(new l70(0), byte[].class);
        Object obj2 = new Object();
        ArrayList arrayList = (ArrayList) obj.c;
        arrayList.add(new ti4(obj2, Uri.class));
        arrayList.add(new ti4(new e62(iw2Var.a), File.class));
        obj.h(new cu2(il6Var3, il6Var2, iw2Var.c), Uri.class);
        obj.h(new av(5), File.class);
        obj.h(new av(0), Uri.class);
        obj.h(new av(3), Uri.class);
        obj.h(new av(6), Uri.class);
        obj.h(new av(4), Drawable.class);
        obj.h(new av(1), Bitmap.class);
        obj.h(new av(2), ByteBuffer.class);
        r20 r20Var = new r20(iw2Var.d, iw2Var.e);
        ArrayList arrayList2 = (ArrayList) obj.e;
        arrayList2.add(r20Var);
        List K = pu.K((ArrayList) obj.a);
        this.g = new ct0(K, pu.K((ArrayList) obj.b), pu.K(arrayList), pu.K((ArrayList) obj.d), pu.K(arrayList2));
        this.h = tq0.Y0(K, new h02(this, nl6Var, ci3Var));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|(5:(1:(1:(9:11|12|13|14|15|16|(4:18|(1:20)(2:27|(1:29)(1:30))|21|(1:23))(2:31|(1:33)(2:34|35))|24|25)(2:53|54))(12:55|56|57|58|59|60|61|62|63|64|(6:67|15|16|(0)(0)|24|25)|66))(4:78|79|80|81)|77|40|41|(3:43|24|25)(2:44|45))(4:98|99|100|(3:102|(1:104)|106)(2:107|108))|82|83|(1:85)|86|(1:88)|89|(8:91|59|60|61|62|63|64|(0))|66))|111|6|(0)(0)|82|83|(0)|86|(0)|89|(0)|66|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        if (defpackage.w81.h(r0, r2) == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
        r3 = r4;
        r4 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00d3, TryCatch #3 {all -> 0x00d3, blocks: (B:43:0x00c5, B:45:0x00cf, B:48:0x00d8, B:50:0x00e2, B:51:0x00e5), top: B:103:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2 A[Catch: all -> 0x00d3, TryCatch #3 {all -> 0x00d3, blocks: (B:43:0x00c5, B:45:0x00cf, B:48:0x00d8, B:50:0x00e2, B:51:0x00e5), top: B:103:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132 A[Catch: all -> 0x0162, TryCatch #2 {all -> 0x0162, blocks: (B:61:0x012c, B:63:0x0132, B:70:0x0154, B:72:0x015b, B:66:0x0141, B:69:0x014e, B:77:0x0164, B:79:0x0168, B:82:0x0179, B:83:0x017e), top: B:102:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164 A[Catch: all -> 0x0162, TryCatch #2 {all -> 0x0162, blocks: (B:61:0x012c, B:63:0x0132, B:70:0x0154, B:72:0x015b, B:66:0x0141, B:69:0x014e, B:77:0x0164, B:79:0x0168, B:82:0x0179, B:83:0x017e), top: B:102:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:90:0x018f, B:92:0x0193, B:95:0x01a4, B:96:0x01ac), top: B:101:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a4 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:90:0x018f, B:92:0x0193, B:95:0x01a4, B:96:0x01ac), top: B:101:0x018f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.c55 r20, defpackage.vw2 r21, int r22, defpackage.k11 r23) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c55.a(c55, vw2, int, k11):java.lang.Object");
    }

    public static void b(m12 m12Var, ym6 ym6Var, t12 t12Var) {
        vw2 vw2Var = m12Var.b;
        if (ym6Var instanceof uv) {
            jx6 a = vw2Var.i.a((uv) ym6Var, m12Var);
            if (!(a instanceof z74)) {
                t12Var.getClass();
                a.a();
            }
        }
        t12Var.getClass();
        uw2 uw2Var = vw2Var.d;
        if (uw2Var != null) {
            uw2Var.c();
        }
    }
}
