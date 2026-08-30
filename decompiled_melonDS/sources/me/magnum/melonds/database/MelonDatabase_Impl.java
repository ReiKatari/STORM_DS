package me.magnum.melonds.database;

import ee.b;
import ee.d;
import he.e;
import he.f;
import he.h;
import he.i;
import he.t;
import j7.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k7.g;
import mc.a;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.database.MelonDatabase_Impl;
import nc.u;
import yb.n;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MelonDatabase_Impl extends MelonDatabase {

    /* renamed from: l  reason: collision with root package name */
    public final n f9472l = new n(new a(this) { // from class: ee.c
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // mc.a
        public final Object b() {
            switch (r2) {
                case 0:
                    return new f(this.B);
                case DSiCameraSource.FrontCamera /* 1 */:
                    return new i(this.B);
                case 2:
                    return new h(this.B);
                case 3:
                    return new e(this.B);
                default:
                    return new t(this.B);
            }
        }
    });
    public final n m = new n(new a(this) { // from class: ee.c
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // mc.a
        public final Object b() {
            switch (r2) {
                case 0:
                    return new f(this.B);
                case DSiCameraSource.FrontCamera /* 1 */:
                    return new i(this.B);
                case 2:
                    return new h(this.B);
                case 3:
                    return new e(this.B);
                default:
                    return new t(this.B);
            }
        }
    });

    /* renamed from: n  reason: collision with root package name */
    public final n f9473n = new n(new a(this) { // from class: ee.c
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // mc.a
        public final Object b() {
            switch (r2) {
                case 0:
                    return new f(this.B);
                case DSiCameraSource.FrontCamera /* 1 */:
                    return new i(this.B);
                case 2:
                    return new h(this.B);
                case 3:
                    return new e(this.B);
                default:
                    return new t(this.B);
            }
        }
    });

    /* renamed from: o  reason: collision with root package name */
    public final n f9474o = new n(new a(this) { // from class: ee.c
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // mc.a
        public final Object b() {
            switch (r2) {
                case 0:
                    return new f(this.B);
                case DSiCameraSource.FrontCamera /* 1 */:
                    return new i(this.B);
                case 2:
                    return new h(this.B);
                case 3:
                    return new e(this.B);
                default:
                    return new t(this.B);
            }
        }
    });

    /* renamed from: p  reason: collision with root package name */
    public final n f9475p = new n(new a(this) { // from class: ee.c
        public final /* synthetic */ MelonDatabase_Impl B;

        {
            this.B = this;
        }

        @Override // mc.a
        public final Object b() {
            switch (r2) {
                case 0:
                    return new f(this.B);
                case DSiCameraSource.FrontCamera /* 1 */:
                    return new i(this.B);
                case 2:
                    return new h(this.B);
                case 3:
                    return new e(this.B);
                default:
                    return new t(this.B);
            }
        }
    });

    @Override // k7.t
    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ee.a(0));
        arrayList.add(new b(3, 4, 0));
        arrayList.add(new b(6, 7, 1));
        return arrayList;
    }

    @Override // k7.t
    public final g d() {
        return new g(this, new LinkedHashMap(), new LinkedHashMap(), "cheat_database", "game", "cheat_folder", "cheat", "ra_game", "ra_achievement_set", "ra_achievement", "ra_user_achievement", "ra_leaderboard", "ra_game_set_metadata", "ra_game_hash_library", "ra_pending_achievement_award");
    }

    @Override // k7.t
    public final e0 e() {
        return new d(this);
    }

    @Override // k7.t
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // k7.t
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nc.e a10 = u.a(f.class);
        q qVar = q.A;
        linkedHashMap.put(a10, qVar);
        linkedHashMap.put(u.a(i.class), qVar);
        linkedHashMap.put(u.a(h.class), qVar);
        linkedHashMap.put(u.a(e.class), qVar);
        linkedHashMap.put(u.a(he.n.class), qVar);
        return linkedHashMap;
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final he.n r() {
        return (he.n) this.f9475p.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final e s() {
        return (e) this.f9474o.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final f t() {
        return (f) this.f9472l.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final h u() {
        return (h) this.f9473n.getValue();
    }

    @Override // me.magnum.melonds.database.MelonDatabase
    public final i v() {
        return (i) this.m.getValue();
    }
}
