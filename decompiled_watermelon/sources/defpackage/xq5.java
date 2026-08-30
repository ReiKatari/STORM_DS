package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xq5  reason: default package */
/* loaded from: classes.dex */
public final class xq5 extends OrientationEventListener {
    public final /* synthetic */ zq5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq5(Context context, zq5 zq5Var) {
        super(context);
        this.a = zq5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
        if (r4 < 315) goto L38;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOrientationChanged(int r4) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L5
            goto L87
        L5:
            zq5 r1 = r3.a
            int r2 = r1.d
            if (r2 != r0) goto L27
            r0 = 45
            if (r4 < 0) goto L12
            if (r4 >= r0) goto L12
            goto L36
        L12:
            r1 = 135(0x87, float:1.89E-43)
            if (r0 > r4) goto L19
            if (r4 >= r1) goto L19
            goto L40
        L19:
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 > r4) goto L20
            if (r4 >= r0) goto L20
            goto L4a
        L20:
            if (r0 > r4) goto L36
            r0 = 315(0x13b, float:4.41E-43)
            if (r4 >= r0) goto L36
            goto L54
        L27:
            if (r4 < 0) goto L2e
            r0 = 40
            if (r4 >= r0) goto L2e
            goto L36
        L2e:
            r0 = 320(0x140, float:4.48E-43)
            if (r0 > r4) goto L38
            r0 = 360(0x168, float:5.04E-43)
            if (r4 >= r0) goto L38
        L36:
            r4 = 0
            goto L58
        L38:
            r0 = 50
            if (r0 > r4) goto L42
            r0 = 130(0x82, float:1.82E-43)
            if (r4 >= r0) goto L42
        L40:
            r4 = 3
            goto L58
        L42:
            r0 = 140(0x8c, float:1.96E-43)
            if (r0 > r4) goto L4c
            r0 = 220(0xdc, float:3.08E-43)
            if (r4 >= r0) goto L4c
        L4a:
            r4 = 2
            goto L58
        L4c:
            r0 = 230(0xe6, float:3.22E-43)
            if (r0 > r4) goto L56
            r0 = 310(0x136, float:4.34E-43)
            if (r4 >= r0) goto L56
        L54:
            r4 = 1
            goto L58
        L56:
            int r4 = r1.d
        L58:
            zq5 r3 = r3.a
            int r0 = r3.d
            if (r0 == r4) goto L87
            r3.d = r4
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.util.LinkedHashMap r3 = r3.c     // Catch: java.lang.Throwable -> L84
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L84
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L84
            java.util.List r3 = defpackage.tq0.n1(r3)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r0)
            java.util.Iterator r3 = r3.iterator()
        L74:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r3.next()
            yq5 r0 = (defpackage.yq5) r0
            r0.a(r4)
            goto L74
        L84:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq5.onOrientationChanged(int):void");
    }
}
