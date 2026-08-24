package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aq0  reason: default package */
/* loaded from: classes.dex */
public final class aq0 extends defpackage.qo7 {
    public final defpackage.hp0 b;
    public final defpackage.v46 c;
    public final defpackage.lx5 d;
    public final defpackage.tp6 e;
    public final java.util.ArrayList f;
    public final defpackage.yp0 g;
    public final defpackage.yp0 h;
    public final defpackage.ex6 i;
    public final defpackage.ex6 j;
    public final defpackage.ex6 k;
    public final defpackage.ex6 l;
    public final defpackage.vl0 m;
    public final defpackage.v80 n;
    public final defpackage.vl0 o;
    public final defpackage.v80 p;
    public final defpackage.vl0 q;
    public final defpackage.v80 r;
    public final defpackage.vl0 s;
    public final defpackage.tp6 t;
    public final defpackage.de5 u;
    public final defpackage.v80 v;
    public final defpackage.vl0 w;

    public aq0(defpackage.hp0 r8, defpackage.v46 r9) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            r7.<init>()
            r7.b = r8
            r7.c = r9
            java.lang.String r8 = "key_rom_info"
            java.lang.Object r8 = r9.a(r8)
            mx5 r8 = (defpackage.mx5) r8
            r0 = 0
            if (r8 == 0) goto L28
            lx5 r1 = new lx5
            java.lang.String r2 = r8.A
            int r3 = r8.B
            java.lang.String r4 = r8.L
            java.lang.String r5 = r8.R
            boolean r6 = r8.X
            r1.<init>(r2, r3, r4, r5, r6)
            goto L29
        L28:
            r1 = r0
        L29:
            r7.d = r1
            java.lang.String r8 = "modified_cheats"
            java.lang.Object r8 = r9.a(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L37
            yt1 r8 = defpackage.yt1.A
        L37:
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r8, r1)
            r9.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L46:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r8.next()
            ho0 r1 = (defpackage.ho0) r1
            me.magnum.melonds.domain.model.Cheat r1 = r1.a()
            r9.add(r1)
            goto L46
        L5a:
            tp6 r8 = defpackage.up6.a(r9)
            r7.e = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.f = r8
            v46 r8 = r7.c
            java.lang.String r9 = "selected_game"
            de5 r8 = r8.b(r9)
            yp0 r9 = new yp0
            r1 = 0
            r9.<init>(r8, r1)
            r7.g = r9
            v46 r8 = r7.c
            java.lang.String r9 = "selected_folder"
            de5 r8 = r8.b(r9)
            yp0 r9 = new yp0
            r1 = 1
            r9.<init>(r8, r1)
            r7.h = r9
            mp0 r8 = new mp0
            r8.<init>(r7, r1)
            ex6 r9 = new ex6
            r9.<init>(r8)
            r7.i = r9
            mp0 r8 = new mp0
            r9 = 2
            r8.<init>(r7, r9)
            ex6 r9 = new ex6
            r9.<init>(r8)
            r7.j = r9
            mp0 r8 = new mp0
            r9 = 3
            r8.<init>(r7, r9)
            ex6 r9 = new ex6
            r9.<init>(r8)
            r7.k = r9
            mp0 r8 = new mp0
            r9 = 4
            r8.<init>(r7, r9)
            ex6 r9 = new ex6
            r9.<init>(r8)
            r7.l = r9
            r8 = -1
            r9 = 6
            v80 r1 = defpackage.nb3.c(r8, r0, r0, r9)
            vl0 r1 = defpackage.f04.N(r1)
            r7.m = r1
            v80 r1 = defpackage.nb3.c(r8, r0, r0, r9)
            r7.n = r1
            vl0 r1 = defpackage.f04.N(r1)
            r7.o = r1
            v80 r1 = defpackage.nb3.c(r8, r0, r0, r9)
            r7.p = r1
            vl0 r1 = defpackage.f04.N(r1)
            r7.q = r1
            v80 r1 = defpackage.nb3.c(r8, r0, r0, r9)
            r7.r = r1
            vl0 r1 = defpackage.f04.N(r1)
            r7.s = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            tp6 r1 = defpackage.up6.a(r1)
            r7.t = r1
            de5 r2 = new de5
            r2.<init>(r1)
            r7.u = r2
            v80 r8 = defpackage.nb3.c(r8, r0, r0, r9)
            r7.v = r8
            vl0 r8 = defpackage.f04.N(r8)
            r7.w = r8
            return
    }

    public final void e(me.magnum.melonds.domain.model.Cheat r18) {
            r17 = this;
            r0 = r17
            r18.getClass()
            de5 r1 = r0.u
            rp6 r1 = r1.A
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L17
            goto Lb3
        L17:
            tp6 r1 = r0.e
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
            r6 = r5
        L26:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L44
            java.lang.Object r7 = r4.next()
            me.magnum.melonds.domain.model.Cheat r7 = (me.magnum.melonds.domain.model.Cheat) r7
            java.lang.Long r7 = r7.getId()
            java.lang.Long r8 = r18.getId()
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 == 0) goto L41
            goto L45
        L41:
            int r6 = r6 + 1
            goto L26
        L44:
            r6 = -1
        L45:
            boolean r4 = r18.getEnabled()
            r14 = r4 ^ 1
            r15 = 31
            r16 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r7 = r18
            me.magnum.melonds.domain.model.Cheat r4 = me.magnum.melonds.domain.model.Cheat.copy$default(r7, r8, r9, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r3)
            if (r6 < 0) goto L66
            r7.set(r6, r4)
            goto L69
        L66:
            r7.add(r4)
        L69:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r7, r4)
            r3.<init>(r4)
            int r4 = r7.size()
        L78:
            if (r5 >= r4) goto La6
            java.lang.Object r6 = r7.get(r5)
            int r5 = r5 + 1
            me.magnum.melonds.domain.model.Cheat r6 = (me.magnum.melonds.domain.model.Cheat) r6
            r6.getClass()
            ho0 r8 = new ho0
            java.lang.Long r9 = r6.getId()
            long r10 = r6.getCheatDatabaseId()
            java.lang.String r12 = r6.getName()
            java.lang.String r13 = r6.getDescription()
            java.lang.String r14 = r6.getCode()
            boolean r15 = r6.getEnabled()
            r8.<init>(r9, r10, r12, r13, r14, r15)
            r3.add(r8)
            goto L78
        La6:
            v46 r4 = r0.c
            java.lang.String r5 = "modified_cheats"
            r4.c(r3, r5)
            boolean r1 = r1.j(r2, r7)
            if (r1 == 0) goto L17
        Lb3:
            return
    }
}
