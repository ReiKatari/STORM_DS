package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj4  reason: default package */
/* loaded from: classes.dex */
public final class pj4 {
    public final ui4 a;
    public final List b;
    public final Map c;
    public final Long d;
    public final Long e;

    public pj4(ui4 ui4Var, List list, Map map, Long l, Long l2) {
        ui4Var.getClass();
        this.a = ui4Var;
        this.b = list;
        this.c = map;
        this.d = l;
        this.e = l2;
    }

    public final int a() {
        int i = 0;
        List<ek4> list = this.b;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        for (ek4 ek4Var : list) {
            if (ek4Var.k == gk4.HARDCORE && (i = i + 1) < 0) {
                hf.p0();
                throw null;
            }
        }
        return i;
    }

    public final int b() {
        int i = 0;
        List<ek4> list = this.b;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        for (ek4 ek4Var : list) {
            if (ek4Var.k == gk4.SOFTCORE && (i = i + 1) < 0) {
                hf.p0();
                throw null;
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj4)) {
            return false;
        }
        pj4 pj4Var = (pj4) obj;
        if (this.a == pj4Var.a && nb3.k(this.b, pj4Var.b) && nb3.k(this.c, pj4Var.c) && nb3.k(this.d, pj4Var.d) && nb3.k(this.e, pj4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + i61.b(this.a.hashCode() * 31, this.b, 31)) * 31;
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

    public /* synthetic */ pj4(ui4 ui4Var) {
        this(ui4Var, yt1.A, zt1.A, null, null);
    }
}
