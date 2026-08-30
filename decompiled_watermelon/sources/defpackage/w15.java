package defpackage;

import java.net.URL;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w15  reason: default package */
/* loaded from: classes.dex */
public final class w15 {
    public final long a;
    public final String b;
    public final gy4 c;
    public final long d;
    public final URL e;
    public final ArrayList f;
    public final ArrayList g;

    public w15(long j, long j2, gy4 gy4Var, String str, URL url, ArrayList arrayList, ArrayList arrayList2) {
        gy4Var.getClass();
        this.a = j;
        this.b = str;
        this.c = gy4Var;
        this.d = j2;
        this.e = url;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w15) {
                w15 w15Var = (w15) obj;
                if (this.a == w15Var.a && b53.x(this.b, w15Var.b) && this.c == w15Var.c && w05.a(this.d, w15Var.d) && this.e.equals(w15Var.e) && this.f.equals(w15Var.f) && this.g.equals(w15Var.g)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.c.hashCode();
        int c = b31.c(this.d, (hashCode3 + ((hashCode2 + hashCode) * 31)) * 31, 31);
        int hashCode4 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode4 + ((this.e.hashCode() + c) * 31)) * 31);
    }

    public final String toString() {
        String b0 = nk2.b0(this.a);
        String b = w05.b(this.d);
        StringBuilder v = b31.v("RAUserAchievementSet(id=", b0, ", title=", this.b, ", type=");
        v.append(this.c);
        v.append(", gameId=");
        v.append(b);
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
