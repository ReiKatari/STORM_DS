package pf;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorMessageQueue B;

    public /* synthetic */ l(EmulatorMessageQueue emulatorMessageQueue, int i2) {
        this.A = i2;
        this.B = emulatorMessageQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageQueue queue;
        int initMessagePipe;
        switch (this.A) {
            case 0:
                EmulatorMessageQueue emulatorMessageQueue = this.B;
                if (emulatorMessageQueue.f9485f) {
                    emulatorMessageQueue.f9485f = false;
                    ParcelFileDescriptor parcelFileDescriptor = emulatorMessageQueue.f9483d;
                    if (parcelFileDescriptor != null) {
                        Looper myLooper = Looper.myLooper();
                        if (myLooper != null && (queue = myLooper.getQueue()) != null) {
                            queue.removeOnFileDescriptorEventListener(parcelFileDescriptor.getFileDescriptor());
                        }
                        parcelFileDescriptor.close();
                    }
                    emulatorMessageQueue.f9484e = null;
                    emulatorMessageQueue.f9483d = null;
                    EmulatorMessageQueue.closeMessagePipe();
                    return;
                }
                return;
            default:
                final EmulatorMessageQueue emulatorMessageQueue2 = this.B;
                if (!emulatorMessageQueue2.f9485f) {
                    Looper myLooper2 = Looper.myLooper();
                    if (myLooper2 != null) {
                        initMessagePipe = EmulatorMessageQueue.initMessagePipe();
                        if (initMessagePipe >= 0) {
                            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(initMessagePipe);
                            if (fromFd != null) {
                                emulatorMessageQueue2.f9483d = fromFd;
                                emulatorMessageQueue2.f9485f = true;
                                emulatorMessageQueue2.f9484e = new FileInputStream(fromFd.getFileDescriptor());
                                myLooper2.getQueue().addOnFileDescriptorEventListener(fromFd.getFileDescriptor(), 1, new MessageQueue.OnFileDescriptorEventListener() { // from class: pf.m
                                    @Override // android.os.MessageQueue.OnFileDescriptorEventListener
                                    public final int onFileDescriptorEvents(FileDescriptor fileDescriptor, int i2) {
                                        fileDescriptor.getClass();
                                        EmulatorMessageQueue emulatorMessageQueue3 = EmulatorMessageQueue.this;
                                        if (emulatorMessageQueue3.f9485f) {
                                            try {
                                                emulatorMessageQueue3.c();
                                                return 1;
                                            } catch (Exception e6) {
                                                e6.printStackTrace();
                                                return 1;
                                            }
                                        }
                                        return 1;
                                    }
                                });
                                return;
                            }
                            m9.o.r("Failed to create ParcelFileDescriptor");
                            return;
                        }
                        m9.o.r("Failed to initialize native pipe");
                        return;
                    }
                    a0.j.p("Current thread does not have a Looper");
                    return;
                }
                return;
        }
    }
}
