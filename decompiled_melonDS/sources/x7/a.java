package x7;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f14373e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14374a;

    /* renamed from: b  reason: collision with root package name */
    public final File f14375b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f14376c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f14377d;

    public a(String str, File file, boolean z10) {
        File file2;
        Lock lock;
        this.f14374a = z10;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.f14375b = file2;
        HashMap hashMap = f14373e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f14376c = lock;
    }

    public final void a(boolean z10) {
        this.f14376c.lock();
        if (z10) {
            File file = this.f14375b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.f14377d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e6) {
                this.f14377d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e6);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f14377d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f14376c.unlock();
    }
}
