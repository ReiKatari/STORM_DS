package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.security.keystore.KeyGenParameterSpec;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import defpackage.b6;
import defpackage.i3;
import defpackage.k63;
import defpackage.os3;
import defpackage.v41;
import java.lang.annotation.Annotation;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.KeyGenerator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c5 implements on2 {
    public final /* synthetic */ int A;

    public /* synthetic */ c5(int i) {
        this.A = i;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return np2.Y(l6.All);
            case 1:
                return np2.Y(g6.All);
            case 2:
                return np2.Y(Boolean.FALSE);
            case 3:
                b6.b bVar = b6.Companion;
                return new ru(i3.a.a, 0);
            case 4:
                b6.b bVar2 = b6.Companion;
                return new ru(os3.a.a, 0);
            case 5:
                i1 i1Var = md5.A;
                return Integer.valueOf(md5.A.e().nextInt(2147418112) + 65536);
            case 6:
                return UUID.randomUUID().toString();
            case 7:
                KeyGenParameterSpec keyGenParameterSpec = h14.a;
                if (keyGenParameterSpec.getKeySize() == 256) {
                    if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                        if (keyGenParameterSpec.getPurposes() == 3) {
                            if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                                if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                                    i.h("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                                    return null;
                                }
                                String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                keyStore.load(null);
                                if (!keyStore.containsAlias(keystoreAlias)) {
                                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                    keyGenerator.init(keyGenParameterSpec);
                                    keyGenerator.generateKey();
                                }
                                return keyGenParameterSpec.getKeystoreAlias();
                            }
                            e41.A(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
                            return null;
                        }
                        e41.n(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
                        return null;
                    }
                    e41.A(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
                    return null;
                }
                i.i("invalid key size, want 256 bits got ", keyGenParameterSpec.getKeySize(), " bits");
                return null;
            case 8:
                return new cn6(hv.b(1308617531));
            case 9:
                return new wh4("me.magnum.melonds.ui.backgrounds.BackgroundsNavigation.BackgroundList", q10.INSTANCE, new Annotation[0]);
            case 10:
                ex6 ex6Var = BackportedFixQuirk.a;
                return new y10();
            case 11:
                nq6 nq6Var = s30.a;
                return null;
            case 12:
                return new CameraCaptureSession();
            case 13:
                return np2.Y(hn0.b);
            case 14:
                return new wh4("me.magnum.melonds.ui.cheats.CheatsNavigation.EnabledCheats", wo0.INSTANCE, new Annotation[0]);
            case 15:
                return new wh4("me.magnum.melonds.ui.cheats.CheatsNavigation.GameList", dp0.INSTANCE, new Annotation[0]);
            case 16:
                long c = hv.c(4284612846L);
                long c2 = hv.c(4281794739L);
                long c3 = hv.c(4278442694L);
                long c4 = hv.c(4278290310L);
                long j = kt0.d;
                long c5 = hv.c(4289724448L);
                long j2 = kt0.b;
                return new ut0(c, c2, c3, c4, j, j, c5, j, j2, j2, j2, j, true);
            case 17:
                return jg7Var;
            case 18:
                nq6 nq6Var2 = dy0.a;
                return null;
            case 19:
                tx0.b("Unexpected call to default provider");
                throw new RuntimeException();
            case 20:
                int i2 = n01.b;
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                int i3 = x01.b;
                return jg7Var;
            case 22:
                int i4 = e11.b;
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                py0 py0Var = g31.a;
                return Float.valueOf(1.0f);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                v41.b bVar3 = v41.Companion;
                return new ru(k63.a.a, 0);
            case 25:
                return w41.a();
            case SubAllocator.N4 /* 26 */:
                return np2.Y(Boolean.FALSE);
            case 27:
                return UUID.randomUUID();
            case 28:
                float f = sn1.a;
                return Boolean.TRUE;
            default:
                nq6 nq6Var3 = os1.a;
                return qd1.a;
        }
    }
}
