package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m36  reason: default package */
/* loaded from: classes.dex */
public final class m36 {
    public final fr5 a;
    public final fr5 b;
    public final fr5 c;

    public m36() {
        fr5 b = gr5.b(4.0f);
        fr5 b2 = gr5.b(4.0f);
        fr5 b3 = gr5.b(RecyclerView.A1);
        this.a = b;
        this.b = b2;
        this.c = b3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m36) {
                m36 m36Var = (m36) obj;
                if (!b53.x(this.a, m36Var.a) || !b53.x(this.b, m36Var.b) || !b53.x(this.c, m36Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}
