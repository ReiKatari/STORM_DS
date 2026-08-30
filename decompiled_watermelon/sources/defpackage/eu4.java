package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eu4  reason: default package */
/* loaded from: classes.dex */
public final class eu4 {
    public static final HashMap e = new HashMap();
    public final boolean a;
    public final File b;
    public final Lock c;
    public FileChannel d;

    public eu4(File file, String str, boolean z) {
        File file2;
        Lock lock;
        this.a = z;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.b = file2;
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = lock;
    }

    public final void a(boolean z) {
        this.c.lock();
        if (z) {
            File file = this.b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e2) {
                this.d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e2);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
