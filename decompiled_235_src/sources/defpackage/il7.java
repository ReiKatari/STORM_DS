package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il7  reason: default package */
/* loaded from: classes.dex */
public interface il7 {
    boolean a();

    long b(ap apVar, ap apVar2, ap apVar3);

    ap h(long j, ap apVar, ap apVar2, ap apVar3);

    ap q(long j, ap apVar, ap apVar2, ap apVar3);

    default ap r(ap apVar, ap apVar2, ap apVar3) {
        return h(b(apVar, apVar2, apVar3), apVar, apVar2, apVar3);
    }
}
