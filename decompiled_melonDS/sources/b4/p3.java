package b4;

import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class p3 {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f1911a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final b4.n3 a(b4.a r6, n2.v r7, v2.c r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = b4.x1.f2005a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            bd.h r0 = ij.a.s(r2, r0, r3)
            yb.n r2 = b4.y0.f2007g0
            java.lang.Object r2 = r2.getValue()
            cc.g r2 = (cc.g) r2
            ah.h0 r2 = zc.x.a(r2)
            a2.o r4 = new a2.o
            r5 = 7
            r4.<init>(r5, r3, r0)
            r5 = 3
            zc.x.v(r2, r3, r3, r4, r5)
            a4.a r2 = new a4.a
            r4 = 7
            r2.<init>(r4, r0)
            java.lang.Object r0 = z2.l.f14919c
            monitor-enter(r0)
            java.lang.Object r4 = z2.l.f14925i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = zb.l.d0(r4, r2)     // Catch: java.lang.Throwable -> L3c
            z2.l.f14925i = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            z2.l.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof b4.x
            if (r1 == 0) goto L50
            b4.x r0 = (b4.x) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            b4.x r0 = new b4.x
            android.content.Context r1 = r6.getContext()
            cc.g r2 = r7.j()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = b4.p3.f1911a
            r6.addView(r1, r2)
        L6e:
            android.view.View r6 = r0.getView()
            r1 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof b4.n3
            if (r2 == 0) goto L80
            r3 = r6
            b4.n3 r3 = (b4.n3) r3
        L80:
            if (r3 != 0) goto L9c
            b4.n3 r3 = new b4.n3
            a4.r2 r6 = new a4.r2
            a4.o0 r2 = r0.getRoot()
            r6.<init>(r2)
            n2.y r2 = new n2.y
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9c:
            r3.b(r8)
            cc.g r6 = r0.getCoroutineContext()
            cc.g r8 = r7.j()
            boolean r6 = nc.k.a(r6, r8)
            if (r6 != 0) goto Lb4
            cc.g r6 = r7.j()
            r0.setCoroutineContext(r6)
        Lb4:
            b4.o3 r6 = new b4.o3
            r6.<init>(r7)
            r0.setFrameEndScheduler$ui(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.p3.a(b4.a, n2.v, v2.c):b4.n3");
    }
}
