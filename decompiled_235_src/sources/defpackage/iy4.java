package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iy4  reason: default package */
/* loaded from: classes.dex */
public final class iy4 extends i1 {
    @Override // defpackage.i1
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
