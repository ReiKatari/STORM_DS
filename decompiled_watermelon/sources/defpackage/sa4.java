package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sa4  reason: default package */
/* loaded from: classes.dex */
public final class sa4 {
    public final x94 a;
    public final List b;
    public final Map c;
    public final Long d;
    public final Long e;

    public sa4(x94 x94Var, List list, Map map, Long l, Long l2) {
        x94Var.getClass();
        this.a = x94Var;
        this.b = list;
        this.c = map;
        this.d = l;
        this.e = l2;
    }

    public final int a() {
        int i = 0;
        List<hb4> list = this.b;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        for (hb4 hb4Var : list) {
            if (hb4Var.k == jb4.HARDCORE && (i = i + 1) < 0) {
                l07.u0();
                throw null;
            }
        }
        return i;
    }

    public final int b() {
        int i = 0;
        List<hb4> list = this.b;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        for (hb4 hb4Var : list) {
            if (hb4Var.k == jb4.SOFTCORE && (i = i + 1) < 0) {
                l07.u0();
                throw null;
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa4)) {
            return false;
        }
        sa4 sa4Var = (sa4) obj;
        if (this.a == sa4Var.a && b53.x(this.b, sa4Var.b) && b53.x(this.c, sa4Var.c) && b53.x(this.d, sa4Var.d) && b53.x(this.e, sa4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + b31.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        int i = 0;
        Long l = this.d;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Long l2 = this.e;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "OfflineLedgerStatus(integrity=" + this.a + ", pendingUnlocks=" + this.b + ", sessions=" + this.c + ", ledgerExpiresAtEpochMs=" + this.d + ", ledgerExpiresInMs=" + this.e + ")";
    }

    public /* synthetic */ sa4(x94 x94Var) {
        this(x94Var, pp1.A, qp1.A, null, null);
    }
}
