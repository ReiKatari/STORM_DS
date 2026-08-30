package z1;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f14862a;

    /* renamed from: b  reason: collision with root package name */
    public final b f14863b;

    /* renamed from: c  reason: collision with root package name */
    public final b f14864c;

    /* renamed from: d  reason: collision with root package name */
    public final View f14865d;

    public d(e eVar, b bVar, b bVar2, View view) {
        this.f14862a = eVar;
        this.f14863b = bVar;
        this.f14864c = bVar2;
        this.f14865d = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
        if (r7 != false) goto L33;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.Menu r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            z1.b r2 = r0.f14863b
            java.lang.Object r2 = r2.b()
            x1.c r2 = (x1.c) r2
            r3 = 0
            boolean r3 = nc.k.a(r2, r3)
            r4 = 0
            if (r3 == 0) goto L15
            return r4
        L15:
            r1.clear()
            java.lang.Object r2 = r2.f14324a
            int r3 = r2.size()
            r5 = 1
            r6 = r4
            r7 = r5
            r8 = r7
        L22:
            if (r6 >= r3) goto Lcd
            java.lang.Object r9 = r2.get(r6)
            x1.b r9 = (x1.b) r9
            boolean r10 = r9 instanceof x1.d
            r11 = 2
            if (r10 == 0) goto L48
            int r10 = r7 + 1
            x1.d r9 = (x1.d) r9
            java.lang.String r12 = r9.f14325b
            android.view.MenuItem r7 = r1.add(r8, r7, r7, r12)
            r7.setShowAsAction(r11)
            z1.c r11 = new z1.c
            r12 = 0
            r11.<init>()
            r7.setOnMenuItemClickListener(r11)
        L45:
            r7 = r10
            goto Lc8
        L48:
            boolean r10 = r9 instanceof x1.h
            if (r10 == 0) goto Lc2
            int r10 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r10 < r12) goto Lc8
            int r10 = r7 + 1
            android.view.View r12 = r0.f14865d
            android.content.Context r12 = r12.getContext()
            x1.h r9 = (x1.h) r9
            android.view.textclassifier.TextClassification r13 = r9.f14334b
            int r9 = r9.f14335c
            r14 = 16908353(0x1020041, float:2.387741E-38)
            if (r9 >= 0) goto L81
            java.lang.CharSequence r9 = qj.a.i(r13)
            android.view.MenuItem r7 = r1.add(r14, r14, r7, r9)
            r7.setShowAsAction(r11)
            android.graphics.drawable.Drawable r9 = qj.a.f(r13)
            r7.setIcon(r9)
            z1.c r9 = new z1.c
            r11 = 1
            r9.<init>()
            r7.setOnMenuItemClickListener(r9)
            goto L45
        L81:
            if (r9 != 0) goto L85
            r15 = r5
            goto L86
        L85:
            r15 = r4
        L86:
            java.util.List r13 = x5.c.b(r13)
            java.lang.Object r9 = r13.get(r9)
            android.app.RemoteAction r9 = qj.a.d(r9)
            if (r15 == 0) goto L96
            r13 = r14
            goto L97
        L96:
            r13 = r4
        L97:
            java.lang.CharSequence r4 = qj.a.h(r9)
            android.view.MenuItem r4 = r1.add(r14, r13, r7, r4)
            if (r15 == 0) goto La2
            goto La3
        La2:
            r11 = 0
        La3:
            r4.setShowAsAction(r11)
            if (r15 != 0) goto Lae
            boolean r7 = x5.c.c(r9)
            if (r7 == 0) goto Lb9
        Lae:
            android.graphics.drawable.Icon r7 = qj.a.g(r9)
            android.graphics.drawable.Drawable r7 = r7.loadDrawable(r12)
            r4.setIcon(r7)
        Lb9:
            z1.q r7 = new z1.q
            r7.<init>()
            r4.setOnMenuItemClickListener(r7)
            goto L45
        Lc2:
            boolean r4 = r9 instanceof x1.f
            if (r4 == 0) goto Lc8
            int r8 = r8 + 1
        Lc8:
            int r6 = r6 + 1
            r4 = 0
            goto L22
        Lcd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.d.a(android.view.Menu):boolean");
    }
}
