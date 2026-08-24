package com.github.junrar.crypt;

import com.github.junrar.unpack.ppm.RangeCoder;
import com.github.junrar.unpack.vm.VMCmdFlags;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Rijndael {
    public static Cipher buildDecipherer(String str, byte[] bArr) {
        if (str != null) {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            int length = str.length() * 2;
            byte[] bArr4 = new byte[length + 8];
            byte[] bytes = str.getBytes();
            for (int i = 0; i < str.length(); i++) {
                int i2 = i * 2;
                bArr4[i2] = bytes[i];
                bArr4[i2 + 1] = 0;
            }
            System.arraycopy(bArr, 0, bArr4, length, bArr.length);
            MessageDigest messageDigest = MessageDigest.getInstance("sha-1");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i3 = 0; i3 < 262144; i3++) {
                byteArrayOutputStream.write(bArr4);
                byteArrayOutputStream.write((byte) i3);
                byteArrayOutputStream.write((byte) (i3 >>> 8));
                byteArrayOutputStream.write((byte) (i3 >>> 16));
                if (i3 % 16384 == 0) {
                    messageDigest.update(byteArrayOutputStream.toByteArray());
                    bArr2[i3 / 16384] = messageDigest.digest()[19];
                }
            }
            messageDigest.update(byteArrayOutputStream.toByteArray());
            byte[] digest = messageDigest.digest();
            for (int i4 = 0; i4 < 4; i4++) {
                for (int i5 = 0; i5 < 4; i5++) {
                    int i6 = i4 * 4;
                    bArr3[i6 + i5] = (byte) (((digest[i6 + 3] & 255) | ((((digest[i6] * RangeCoder.TOP) & (-16777216)) | ((digest[i6 + 1] * VMCmdFlags.VMCF_OP0) & 16711680)) | ((digest[i6 + 2] * VMCmdFlags.VMCF_OP0) & 65280))) >>> (i5 * 8));
                }
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, new SecretKeySpec(bArr3, "AES"), new IvParameterSpec(bArr2));
            return cipher;
        }
        throw new InvalidAlgorithmParameterException("password should be specified");
    }
}
