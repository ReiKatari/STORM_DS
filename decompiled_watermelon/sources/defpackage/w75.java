package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w75  reason: default package */
/* loaded from: classes.dex */
public final class w75 extends hi2 {
    @Override // defpackage.hi2
    public final boolean F(Class cls) {
        return false;
    }

    @Override // defpackage.hi2
    public final Method o(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // defpackage.hi2
    public final Constructor p(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // defpackage.hi2
    public final String[] y(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
}
