package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ep4  reason: default package */
/* loaded from: classes.dex */
public final class ep4 extends h1 {
    @Override // defpackage.h1
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }
}
