package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j77  reason: default package */
/* loaded from: classes.dex */
public interface j77 {
    boolean a();

    long b(oo ooVar, oo ooVar2, oo ooVar3);

    oo l(long j, oo ooVar, oo ooVar2, oo ooVar3);

    oo p(long j, oo ooVar, oo ooVar2, oo ooVar3);

    default oo q(oo ooVar, oo ooVar2, oo ooVar3) {
        return l(b(ooVar, ooVar2, ooVar3), ooVar, ooVar2, ooVar3);
    }
}
