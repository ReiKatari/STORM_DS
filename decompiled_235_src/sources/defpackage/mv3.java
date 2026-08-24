package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv3  reason: default package */
/* loaded from: classes.dex */
public final class mv3 extends a21 {
    public final String g;
    public final String h;

    public mv3(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.a21
    public final void a(eb ebVar) {
        ebVar.P(this);
    }

    @Override // defpackage.a21
    public final String i() {
        return "destination=" + this.g + ", title=" + this.h;
    }
}
