package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tp5  reason: default package */
/* loaded from: classes.dex */
public final class tp5 implements java.util.Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ tp5(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r4 = r4.a
            r0 = 0
            switch(r4) {
                case 0: goto L264;
                case 1: goto L247;
                case 2: goto L22a;
                case 3: goto L20d;
                case 4: goto L200;
                case 5: goto L1eb;
                case 6: goto L1d6;
                case 7: goto L1c1;
                case 8: goto L182;
                case 9: goto L16d;
                case 10: goto Ld8;
                case 11: goto L3b;
                case 12: goto L2e;
                case 13: goto L21;
                case 14: goto L13;
                default: goto L6;
            }
        L6:
            jy7 r5 = (defpackage.jy7) r5
            lt4 r4 = r5.a
            jy7 r6 = (defpackage.jy7) r6
            lt4 r5 = r6.a
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L13:
            android.view.View r5 = (android.view.View) r5
            android.view.View r6 = (android.view.View) r6
            int r4 = r5.getTop()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            return r4
        L21:
            py6 r5 = (defpackage.py6) r5
            java.lang.String r4 = r5.a
            py6 r6 = (defpackage.py6) r6
            java.lang.String r5 = r6.a
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L2e:
            ny6 r5 = (defpackage.ny6) r5
            java.lang.String r4 = r5.a
            ny6 r6 = (defpackage.ny6) r6
            java.lang.String r5 = r6.a
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L3b:
            ki0 r5 = (defpackage.ki0) r5
            java.util.ArrayList r4 = r5.b
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld4
            java.lang.Object r5 = r4.next()
            ir6 r5 = (defpackage.ir6) r5
            java.util.List r1 = defpackage.jr6.l0
            int r5 = r5.c
            fr6 r2 = new fr6
            r2.<init>(r5)
            int r5 = r1.indexOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L60:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r4.next()
            ir6 r1 = (defpackage.ir6) r1
            java.util.List r2 = defpackage.jr6.l0
            int r1 = r1.c
            fr6 r3 = new fr6
            r3.<init>(r1)
            int r1 = r2.indexOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.compareTo(r1)
            if (r2 >= 0) goto L60
            r5 = r1
            goto L60
        L85:
            ki0 r6 = (defpackage.ki0) r6
            java.util.ArrayList r4 = r6.b
            java.util.Iterator r4 = r4.iterator()
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Ld4
            java.lang.Object r6 = r4.next()
            ir6 r6 = (defpackage.ir6) r6
            java.util.List r0 = defpackage.jr6.l0
            int r6 = r6.c
            fr6 r1 = new fr6
            r1.<init>(r6)
            int r6 = r0.indexOf(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        Laa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lcf
            java.lang.Object r0 = r4.next()
            ir6 r0 = (defpackage.ir6) r0
            java.util.List r1 = defpackage.jr6.l0
            int r0 = r0.c
            fr6 r2 = new fr6
            r2.<init>(r0)
            int r0 = r1.indexOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r6.compareTo(r0)
            if (r1 >= 0) goto Laa
            r6 = r0
            goto Laa
        Lcf:
            int r0 = defpackage.g04.z(r5, r6)
            goto Ld7
        Ld4:
            defpackage.fa6.c()
        Ld7:
            return r0
        Ld8:
            ki0 r5 = (defpackage.ki0) r5
            java.util.ArrayList r4 = r5.b
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L169
            java.lang.Object r5 = r4.next()
            ir6 r5 = (defpackage.ir6) r5
            java.util.List r1 = defpackage.jr6.j0
            vs0 r5 = r5.h
            r1.getClass()
            int r5 = r1.indexOf(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        Lfb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L11e
            java.lang.Object r1 = r4.next()
            ir6 r1 = (defpackage.ir6) r1
            java.util.List r2 = defpackage.jr6.j0
            vs0 r1 = r1.h
            r2.getClass()
            int r1 = r2.indexOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.compareTo(r1)
            if (r2 >= 0) goto Lfb
            r5 = r1
            goto Lfb
        L11e:
            ki0 r6 = (defpackage.ki0) r6
            java.util.ArrayList r4 = r6.b
            java.util.Iterator r4 = r4.iterator()
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L169
            java.lang.Object r6 = r4.next()
            ir6 r6 = (defpackage.ir6) r6
            java.util.List r0 = defpackage.jr6.j0
            vs0 r6 = r6.h
            r0.getClass()
            int r6 = r0.indexOf(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L141:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L164
            java.lang.Object r0 = r4.next()
            ir6 r0 = (defpackage.ir6) r0
            java.util.List r1 = defpackage.jr6.j0
            vs0 r0 = r0.h
            r1.getClass()
            int r0 = r1.indexOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r6.compareTo(r0)
            if (r1 >= 0) goto L141
            r6 = r0
            goto L141
        L164:
            int r0 = defpackage.g04.z(r5, r6)
            goto L16c
        L169:
            defpackage.fa6.c()
        L16c:
            return r0
        L16d:
            ek4 r5 = (defpackage.ek4) r5
            long r4 = r5.i
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            ek4 r6 = (defpackage.ek4) r6
            long r5 = r6.i
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L182:
            if6 r5 = (defpackage.if6) r5
            rs4 r4 = r5.B
            float r4 = r4.h()
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 != 0) goto L197
            if6 r4 = r5.g0
            if (r4 != 0) goto L197
            r4 = r1
            goto L19d
        L197:
            rs4 r4 = r5.B
            float r4 = r4.h()
        L19d:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            if6 r6 = (defpackage.if6) r6
            rs4 r5 = r6.B
            float r5 = r5.h()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L1b2
            if6 r5 = r6.g0
            if (r5 != 0) goto L1b2
            goto L1b8
        L1b2:
            rs4 r5 = r6.B
            float r1 = r5.h()
        L1b8:
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L1c1:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r4 = r5.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r5 = r6.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L1d6:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r4 = r5.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r5 = r6.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L1eb:
            a06 r5 = (defpackage.a06) r5
            int r4 = r5.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            a06 r6 = (defpackage.a06) r6
            int r5 = r6.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L200:
            pq5 r6 = (defpackage.pq5) r6
            java.util.Date r4 = r6.g
            pq5 r5 = (defpackage.pq5) r5
            java.util.Date r5 = r5.g
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L20d:
            jz5 r5 = (defpackage.jz5) r5
            java.lang.String r4 = r5.d
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            jz5 r6 = (defpackage.jz5) r6
            java.lang.String r6 = r6.d
            java.lang.String r5 = r6.toLowerCase(r5)
            r5.getClass()
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L22a:
            lz5 r5 = (defpackage.lz5) r5
            java.lang.String r4 = r5.c
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            lz5 r6 = (defpackage.lz5) r6
            java.lang.String r6 = r6.c
            java.lang.String r5 = r6.toLowerCase(r5)
            r5.getClass()
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L247:
            h3 r5 = (defpackage.h3) r5
            g3 r4 = r5.a
            int r4 = r4.getDisplayOrder()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            h3 r6 = (defpackage.h3) r6
            g3 r5 = r6.a
            int r5 = r5.getDisplayOrder()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r4 = defpackage.g04.z(r4, r5)
            return r4
        L264:
            me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r6 = (me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState) r6
            int r4 = r6.getFrame()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r5 = (me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState) r5
            int r5 = r5.getFrame()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r4 = defpackage.g04.z(r4, r5)
            return r4
    }
}
