package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bc  reason: default package */
/* loaded from: classes.dex */
public final class bc extends CancellationException {
    public bc() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(jv3.i);
        return this;
    }
}
