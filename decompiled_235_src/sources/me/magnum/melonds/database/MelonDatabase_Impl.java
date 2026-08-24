package me.magnum.melonds.database;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.database.MelonDatabase_Impl;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MelonDatabase_Impl extends MelonDatabase {
    public final ex6 l = new ex6(new on2(this) { // from class: s34
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new xm0(melonDatabase_Impl);
                case 1:
                    return new ip2(melonDatabase_Impl);
                case 2:
                    return new bn0(melonDatabase_Impl);
                case 3:
                    return new vm0(melonDatabase_Impl);
                default:
                    return new bn5(melonDatabase_Impl);
            }
        }
    });
    public final ex6 m = new ex6(new on2(this) { // from class: s34
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new xm0(melonDatabase_Impl);
                case 1:
                    return new ip2(melonDatabase_Impl);
                case 2:
                    return new bn0(melonDatabase_Impl);
                case 3:
                    return new vm0(melonDatabase_Impl);
                default:
                    return new bn5(melonDatabase_Impl);
            }
        }
    });
    public final ex6 n = new ex6(new on2(this) { // from class: s34
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new xm0(melonDatabase_Impl);
                case 1:
                    return new ip2(melonDatabase_Impl);
                case 2:
                    return new bn0(melonDatabase_Impl);
                case 3:
                    return new vm0(melonDatabase_Impl);
                default:
                    return new bn5(melonDatabase_Impl);
            }
        }
    });
    public final ex6 o = new ex6(new on2(this) { // from class: s34
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new xm0(melonDatabase_Impl);
                case 1:
                    return new ip2(melonDatabase_Impl);
                case 2:
                    return new bn0(melonDatabase_Impl);
                case 3:
                    return new vm0(melonDatabase_Impl);
                default:
                    return new bn5(melonDatabase_Impl);
            }
        }
    });
    public final ex6 p = new ex6(new on2(this) { // from class: s34
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new xm0(melonDatabase_Impl);
                case 1:
                    return new ip2(melonDatabase_Impl);
                case 2:
                    return new bn0(melonDatabase_Impl);
                case 3:
                    return new vm0(melonDatabase_Impl);
                default:
                    return new bn5(melonDatabase_Impl);
            }
        }
    });

    @Override // defpackage.m16
    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r34(0));
        arrayList.add(new j64(3, 4, 10));
        arrayList.add(new j64(6, 7, 11));
        return arrayList;
    }

    @Override // defpackage.m16
    public final zb3 d() {
        return new zb3(this, new LinkedHashMap(), new LinkedHashMap(), "cheat_database", "game", "cheat_folder", "cheat", "ra_game", "ra_achievement_set", "ra_achievement", "ra_user_achievement", "ra_leaderboard", "ra_game_set_metadata", "ra_game_hash_library", "ra_pending_achievement_award");
    }

    @Override // defpackage.m16
    public final ts1 e() {
        return new t34(this);
    }

    @Override // defpackage.m16
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // defpackage.m16
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ar0 a = gh5.a(xm0.class);
        yt1 yt1Var = yt1.A;
        linkedHashMap.put(a, yt1Var);
        linkedHashMap.put(gh5.a(ip2.class), yt1Var);
        linkedHashMap.put(gh5.a(bn0.class), yt1Var);
        linkedHashMap.put(gh5.a(vm0.class), yt1Var);
        linkedHashMap.put(gh5.a(vm5.class), yt1Var);
        return linkedHashMap;
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final vm5 r() {
        return (vm5) this.p.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final vm0 s() {
        return (vm0) this.o.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final xm0 t() {
        return (xm0) this.l.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final bn0 u() {
        return (bn0) this.n.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final ip2 v() {
        return (ip2) this.m.getValue();
    }
}
