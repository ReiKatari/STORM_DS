package me.magnum.melonds.translator.capture;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ScreenCaptureService extends Service {
    public static volatile boolean A;
    public static volatile int B;
    public static volatile Intent L;
    public static MediaProjection R;
    public static VirtualDisplay X;
    public static ImageReader Y;
    public static final Handler Z = new Handler(Looper.getMainLooper());
    public static volatile Bitmap d0;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        x31.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, android.media.ImageReader$OnImageAvailableListener] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Intent intent2 = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (nb3.k(str, "me.magnum.melonds.translator.STOP_CAPTURE")) {
            x31.q();
            stopForeground(1);
            stopSelf();
            return 2;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            q66.p();
            NotificationChannel b = q66.b();
            b.setDescription("Active screen translation service");
            b.setShowBadge(false);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(b);
        }
        xg4 xg4Var = new xg4(this, "storm_ds_screen_capture");
        xg4Var.e = xg4.b("STORM DS Screen Translator");
        xg4Var.f = xg4.b("Screen translation active");
        xg4Var.t.icon = R.drawable.ic_translate;
        xg4Var.h = -1;
        xg4Var.c(2);
        Notification a = xg4Var.a();
        a.getClass();
        int i8 = 0;
        if (i7 >= 29) {
            i3 = 32;
        } else {
            i3 = 0;
        }
        if (i7 >= 34) {
            rp.x(this, a, i3);
        } else if (i7 >= 29) {
            rp.v(this, a, i3);
        } else {
            startForeground(8842, a);
        }
        if (B != 0) {
            i8 = B;
        } else if (intent != null) {
            i8 = intent.getIntExtra("extra_result_code", 0);
        }
        Intent intent3 = L;
        if (intent3 == null) {
            if (i7 >= 33) {
                if (intent != null) {
                    intent2 = (Intent) a81.l(intent);
                }
            } else if (intent != null) {
                intent2 = (Intent) intent.getParcelableExtra("extra_data_intent");
            }
        } else {
            intent2 = intent3;
        }
        if (i8 == -1 && intent2 != null && R == null) {
            try {
                Object systemService = getSystemService("media_projection");
                systemService.getClass();
                MediaProjection mediaProjection = ((MediaProjectionManager) systemService).getMediaProjection(i8, intent2);
                if (mediaProjection == null) {
                    Log.e("ScreenCaptureService", "MediaProjectionManager.getMediaProjection returned null");
                } else {
                    R = mediaProjection;
                    MediaProjection.Callback callback = new MediaProjection.Callback();
                    Handler handler = Z;
                    mediaProjection.registerCallback(callback, handler);
                    Object systemService2 = getSystemService("window");
                    systemService2.getClass();
                    WindowManager windowManager = (WindowManager) systemService2;
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    if (i7 >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        bounds = currentWindowMetrics.getBounds();
                        bounds.getClass();
                        displayMetrics.widthPixels = bounds.width();
                        displayMetrics.heightPixels = bounds.height();
                        displayMetrics.densityDpi = getResources().getConfiguration().densityDpi;
                    } else {
                        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    }
                    int i9 = displayMetrics.widthPixels;
                    if (i9 < 1) {
                        i4 = 1;
                    } else {
                        i4 = i9;
                    }
                    int i10 = displayMetrics.heightPixels;
                    if (i10 < 1) {
                        i5 = 1;
                    } else {
                        i5 = i10;
                    }
                    int i11 = displayMetrics.densityDpi;
                    if (i11 < 1) {
                        i6 = 1;
                    } else {
                        i6 = i11;
                    }
                    ImageReader newInstance = ImageReader.newInstance(i4, i5, 1, 2);
                    newInstance.getClass();
                    newInstance.setOnImageAvailableListener(new Object(), handler);
                    Y = newInstance;
                    X = mediaProjection.createVirtualDisplay("StormScreenCapture", i4, i5, i6, 16, newInstance.getSurface(), null, handler);
                    A = true;
                    Log.i("ScreenCaptureService", "MediaProjection and VirtualDisplay successfully initialized (" + i4 + "x" + i5 + " @ " + i6 + "dpi)");
                }
            } catch (Throwable th) {
                Log.e("ScreenCaptureService", "Failed to initialize MediaProjection in service", th);
                x31.q();
            }
        }
        return 1;
    }
}
