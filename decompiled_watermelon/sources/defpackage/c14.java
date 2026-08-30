package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c14  reason: default package */
/* loaded from: classes.dex */
public final class c14 implements wz0, Consumer2 {
    public final Context a;
    public kg7 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public c14(Context context) {
        this.a = context;
    }

    public final void a(wz0 wz0Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            kg7 kg7Var = this.c;
            if (kg7Var != null) {
                wz0Var.accept(kg7Var);
            }
            this.d.add(wz0Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.wz0
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            kg7 c = b42.c(this.a, windowLayoutInfo);
            this.c = c;
            for (wz0 wz0Var : this.d) {
                wz0Var.accept(c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
