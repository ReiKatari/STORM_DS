package defpackage;

import java.net.URL;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hy4  reason: default package */
/* loaded from: classes.dex */
public final class hy4 {
    public final long a;
    public final long b;
    public final String c;
    public final gy4 d;
    public final URL e;
    public final ArrayList f;
    public final ArrayList g;

    public hy4(long j, long j2, gy4 gy4Var, String str, URL url, ArrayList arrayList, ArrayList arrayList2) {
        gy4Var.getClass();
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = gy4Var;
        this.e = url;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hy4) {
                hy4 hy4Var = (hy4) obj;
                if (this.a == hy4Var.a && w05.a(this.b, hy4Var.b) && b53.x(this.c, hy4Var.c) && this.d == hy4Var.d && this.e.equals(hy4Var.e) && this.f.equals(hy4Var.f) && this.g.equals(hy4Var.g)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c = b31.c(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((c + hashCode) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("RAAchievementSet(id=", nk2.b0(this.a), ", gameId=", w05.b(this.b), ", title=");
        v.append(this.c);
        v.append(", type=");
        v.append(this.d);
        v.append(", iconUrl=");
        v.append(this.e);
        v.append(", achievements=");
        v.append(this.f);
        v.append(", leaderboards=");
        v.append(this.g);
        v.append(")");
        return v.toString();
    }
}
