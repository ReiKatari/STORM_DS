package me.magnum.melonds.database;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonDatabase_Impl extends me.magnum.melonds.database.MelonDatabase {
    public final defpackage.ex6 l;
    public final defpackage.ex6 m;
    public final defpackage.ex6 n;
    public final defpackage.ex6 o;
    public final defpackage.ex6 p;

    public MelonDatabase_Impl() {
            r2 = this;
            r2.<init>()
            s34 r0 = new s34
            r1 = 0
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.l = r1
            s34 r0 = new s34
            r1 = 1
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.m = r1
            s34 r0 = new s34
            r1 = 2
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.n = r1
            s34 r0 = new s34
            r1 = 3
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.o = r1
            s34 r0 = new s34
            r1 = 4
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.p = r1
            return
    }

    @Override // defpackage.m16
    public final java.util.List c(java.util.LinkedHashMap r4) {
            r3 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r34 r4 = new r34
            r0 = 0
            r4.<init>(r0)
            r3.add(r4)
            j64 r4 = new j64
            r0 = 4
            r1 = 10
            r2 = 3
            r4.<init>(r2, r0, r1)
            r3.add(r4)
            j64 r4 = new j64
            r0 = 7
            r1 = 11
            r2 = 6
            r4.<init>(r2, r0, r1)
            r3.add(r4)
            return r3
    }

    @Override // defpackage.m16
    public final defpackage.zb3 d() {
            r15 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            zb3 r2 = new zb3
            java.lang.String r13 = "ra_game_hash_library"
            java.lang.String r14 = "ra_pending_achievement_award"
            java.lang.String r3 = "cheat_database"
            java.lang.String r4 = "game"
            java.lang.String r5 = "cheat_folder"
            java.lang.String r6 = "cheat"
            java.lang.String r7 = "ra_game"
            java.lang.String r8 = "ra_achievement_set"
            java.lang.String r9 = "ra_achievement"
            java.lang.String r10 = "ra_user_achievement"
            java.lang.String r11 = "ra_leaderboard"
            java.lang.String r12 = "ra_game_set_metadata"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            r2.<init>(r15, r0, r1, r3)
            return r2
    }

    @Override // defpackage.m16
    public final defpackage.ts1 e() {
            r1 = this;
            t34 r0 = new t34
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.m16
    public final java.util.Set i() {
            r0 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
    }

    @Override // defpackage.m16
    public final java.util.LinkedHashMap j() {
            r2 = this;
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.Class<xm0> r0 = defpackage.xm0.class
            ar0 r0 = defpackage.gh5.a(r0)
            yt1 r1 = defpackage.yt1.A
            r2.put(r0, r1)
            java.lang.Class<ip2> r0 = defpackage.ip2.class
            ar0 r0 = defpackage.gh5.a(r0)
            r2.put(r0, r1)
            java.lang.Class<bn0> r0 = defpackage.bn0.class
            ar0 r0 = defpackage.gh5.a(r0)
            r2.put(r0, r1)
            java.lang.Class<vm0> r0 = defpackage.vm0.class
            ar0 r0 = defpackage.gh5.a(r0)
            r2.put(r0, r1)
            java.lang.Class<vm5> r0 = defpackage.vm5.class
            ar0 r0 = defpackage.gh5.a(r0)
            r2.put(r0, r1)
            return r2
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final defpackage.vm5 r() {
            r0 = this;
            ex6 r0 = r0.p
            java.lang.Object r0 = r0.getValue()
            vm5 r0 = (defpackage.vm5) r0
            return r0
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final defpackage.vm0 s() {
            r0 = this;
            ex6 r0 = r0.o
            java.lang.Object r0 = r0.getValue()
            vm0 r0 = (defpackage.vm0) r0
            return r0
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final defpackage.xm0 t() {
            r0 = this;
            ex6 r0 = r0.l
            java.lang.Object r0 = r0.getValue()
            xm0 r0 = (defpackage.xm0) r0
            return r0
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final defpackage.bn0 u() {
            r0 = this;
            ex6 r0 = r0.n
            java.lang.Object r0 = r0.getValue()
            bn0 r0 = (defpackage.bn0) r0
            return r0
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final defpackage.ip2 v() {
            r0 = this;
            ex6 r0 = r0.m
            java.lang.Object r0 = r0.getValue()
            ip2 r0 = (defpackage.ip2) r0
            return r0
    }
}
