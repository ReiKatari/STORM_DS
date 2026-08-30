package me.magnum.melonds.database;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.database.MelonDatabase_Impl;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MelonDatabase_Impl extends MelonDatabase {
    public final il6 l = new il6(new ki2(this) { // from class: gw3
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new pk0(melonDatabase_Impl);
                case 1:
                    return new ek2(melonDatabase_Impl);
                case 2:
                    return new tk0(melonDatabase_Impl);
                case 3:
                    return new mk0(melonDatabase_Impl);
                default:
                    return new hd5(melonDatabase_Impl);
            }
        }
    });
    public final il6 m = new il6(new ki2(this) { // from class: gw3
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new pk0(melonDatabase_Impl);
                case 1:
                    return new ek2(melonDatabase_Impl);
                case 2:
                    return new tk0(melonDatabase_Impl);
                case 3:
                    return new mk0(melonDatabase_Impl);
                default:
                    return new hd5(melonDatabase_Impl);
            }
        }
    });
    public final il6 n = new il6(new ki2(this) { // from class: gw3
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new pk0(melonDatabase_Impl);
                case 1:
                    return new ek2(melonDatabase_Impl);
                case 2:
                    return new tk0(melonDatabase_Impl);
                case 3:
                    return new mk0(melonDatabase_Impl);
                default:
                    return new hd5(melonDatabase_Impl);
            }
        }
    });
    public final il6 o = new il6(new ki2(this) { // from class: gw3
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new pk0(melonDatabase_Impl);
                case 1:
                    return new ek2(melonDatabase_Impl);
                case 2:
                    return new tk0(melonDatabase_Impl);
                case 3:
                    return new mk0(melonDatabase_Impl);
                default:
                    return new hd5(melonDatabase_Impl);
            }
        }
    });
    public final il6 p = new il6(new ki2(this) { // from class: gw3
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            MelonDatabase_Impl melonDatabase_Impl = this.B;
            switch (i) {
                case 0:
                    return new pk0(melonDatabase_Impl);
                case 1:
                    return new ek2(melonDatabase_Impl);
                case 2:
                    return new tk0(melonDatabase_Impl);
                case 3:
                    return new mk0(melonDatabase_Impl);
                default:
                    return new hd5(melonDatabase_Impl);
            }
        }
    });

    @Override // defpackage.sq5
    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fw3(0));
        arrayList.add(new qy3(3, 4, 10));
        arrayList.add(new qy3(6, 7, 11));
        return arrayList;
    }

    @Override // defpackage.sq5
    public final m53 d() {
        return new m53(this, new LinkedHashMap(), new LinkedHashMap(), "cheat_database", "game", "cheat_folder", "cheat", "ra_game", "ra_achievement_set", "ra_achievement", "ra_user_achievement", "ra_leaderboard", "ra_game_set_metadata", "ra_game_hash_library", "ra_pending_achievement_award");
    }

    @Override // defpackage.sq5
    public final io1 e() {
        return new hw3(this);
    }

    @Override // defpackage.sq5
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // defpackage.sq5
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        qo0 a = q75.a(pk0.class);
        pp1 pp1Var = pp1.A;
        linkedHashMap.put(a, pp1Var);
        linkedHashMap.put(q75.a(ek2.class), pp1Var);
        linkedHashMap.put(q75.a(tk0.class), pp1Var);
        linkedHashMap.put(q75.a(mk0.class), pp1Var);
        linkedHashMap.put(q75.a(bd5.class), pp1Var);
        return linkedHashMap;
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final bd5 r() {
        return (bd5) this.p.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final mk0 s() {
        return (mk0) this.o.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final pk0 t() {
        return (pk0) this.l.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final tk0 u() {
        return (tk0) this.n.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final ek2 v() {
        return (ek2) this.m.getValue();
    }
}
