package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ip1  reason: default package */
/* loaded from: classes.dex */
public final class ip1 implements ay2 {
    public final boolean A;

    public ip1(boolean z) {
        this.A = z;
    }

    @Override // defpackage.ay2
    public final boolean d() {
        return this.A;
    }

    @Override // defpackage.ay2
    public final o74 e() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.A) {
            str = "Active";
        } else {
            str = "New";
        }
        return wh1.o(sb, str, '}');
    }
}
