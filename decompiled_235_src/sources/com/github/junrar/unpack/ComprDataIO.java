package com.github.junrar.unpack;

import com.github.junrar.Archive;
import com.github.junrar.UnrarCallback;
import com.github.junrar.crc.RarCRC;
import com.github.junrar.crypt.Rijndael;
import com.github.junrar.exception.CrcErrorException;
import com.github.junrar.exception.InitDeciphererFailedException;
import com.github.junrar.io.RawDataIo;
import com.github.junrar.rarfile.FileHeader;
import com.github.junrar.volume.Volume;
import com.github.junrar.volume.VolumeManager;
import java.io.OutputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ComprDataIO {
    private final Archive archive;
    private long curPackRead;
    private long curPackWrite;
    private long curUnpRead;
    private long curUnpWrite;
    private int decryption;
    private int encryption;
    private boolean nextVolumeMissing;
    private OutputStream outputStream;
    private long packFileCRC;
    private boolean packVolume;
    private long packedCRC;
    private long processedArcSize;
    private boolean skipUnpCRC;
    private FileHeader subHead;
    private boolean testMode;
    private long totalArcSize;
    private long totalPackRead;
    private RawDataIo underlyingDataIo;
    private long unpArcSize;
    private long unpFileCRC;
    private long unpPackedSize;
    private boolean unpVolume;

    public ComprDataIO(Archive archive) {
        this.archive = archive;
    }

    public long getCurPackRead() {
        return this.curPackRead;
    }

    public long getCurPackWrite() {
        return this.curPackWrite;
    }

    public long getCurUnpRead() {
        return this.curUnpRead;
    }

    public long getCurUnpWrite() {
        return this.curUnpWrite;
    }

    public int getDecryption() {
        return this.decryption;
    }

    public int getEncryption() {
        return this.encryption;
    }

    public long getPackFileCRC() {
        return this.packFileCRC;
    }

    public long getPackedCRC() {
        return this.packedCRC;
    }

    public long getProcessedArcSize() {
        return this.processedArcSize;
    }

    public FileHeader getSubHeader() {
        return this.subHead;
    }

    public long getTotalArcSize() {
        return this.totalArcSize;
    }

    public long getTotalPackRead() {
        return this.totalPackRead;
    }

    public long getUnpArcSize() {
        return this.unpArcSize;
    }

    public long getUnpFileCRC() {
        return this.unpFileCRC;
    }

    public void init(FileHeader fileHeader) {
        long positionInFile = fileHeader.getPositionInFile() + fileHeader.getHeaderSize(this.archive.isEncrypted());
        this.unpPackedSize = fileHeader.getFullPackSize();
        this.archive.getChannel().setPosition(positionInFile);
        this.underlyingDataIo = new RawDataIo(this.archive.getChannel());
        this.subHead = fileHeader;
        this.curUnpRead = 0L;
        this.curPackWrite = 0L;
        this.packedCRC = -1L;
        if (fileHeader.isEncrypted()) {
            try {
                this.underlyingDataIo.setCipher(Rijndael.buildDecipherer(this.archive.getPassword(), fileHeader.getSalt()));
            } catch (Exception e) {
                throw new InitDeciphererFailedException(e);
            }
        }
    }

    public boolean isNextVolumeMissing() {
        return this.nextVolumeMissing;
    }

    public boolean isPackVolume() {
        return this.packVolume;
    }

    public boolean isUnpVolume() {
        return this.unpVolume;
    }

    public void setCurPackRead(long j) {
        this.curPackRead = j;
    }

    public void setCurPackWrite(long j) {
        this.curPackWrite = j;
    }

    public void setCurUnpRead(long j) {
        this.curUnpRead = j;
    }

    public void setCurUnpWrite(long j) {
        this.curUnpWrite = j;
    }

    public void setDecryption(int i) {
        this.decryption = i;
    }

    public void setEncryption(int i) {
        this.encryption = i;
    }

    public void setNextVolumeMissing(boolean z) {
        this.nextVolumeMissing = z;
    }

    public void setPackFileCRC(long j) {
        this.packFileCRC = j;
    }

    public void setPackVolume(boolean z) {
        this.packVolume = z;
    }

    public void setPackedCRC(long j) {
        this.packedCRC = j;
    }

    public void setPackedSizeToRead(long j) {
        this.unpPackedSize = j;
    }

    public void setProcessedArcSize(long j) {
        this.processedArcSize = j;
    }

    public void setSkipUnpCRC(boolean z) {
        this.skipUnpCRC = z;
    }

    public void setSubHeader(FileHeader fileHeader) {
        this.subHead = fileHeader;
    }

    public void setTestMode(boolean z) {
        this.testMode = z;
    }

    public void setTotalArcSize(long j) {
        this.totalArcSize = j;
    }

    public void setTotalPackRead(long j) {
        this.totalPackRead = j;
    }

    public void setUnpArcSize(long j) {
        this.unpArcSize = j;
    }

    public void setUnpFileCRC(long j) {
        this.unpFileCRC = j;
    }

    public void setUnpVolume(boolean z) {
        this.unpVolume = z;
    }

    public int unpRead(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            long j = this.unpPackedSize;
            if (i2 > j) {
                i3 = (int) j;
            } else {
                i3 = i2;
            }
            i5 = this.underlyingDataIo.read(bArr, i, i3);
            if (i5 >= 0) {
                if (this.subHead.isSplitAfter()) {
                    this.packedCRC = RarCRC.checkCrc((int) this.packedCRC, bArr, i, i5);
                }
                i4 += i5;
                i2 -= i5;
                i += i5;
                long j2 = i5;
                this.unpPackedSize -= j2;
                this.curUnpRead += j2;
                this.archive.bytesReadRead(i5);
                if (this.unpPackedSize != 0 || !this.subHead.isSplitAfter()) {
                    break;
                }
                VolumeManager volumeManager = this.archive.getVolumeManager();
                Archive archive = this.archive;
                Volume nextVolume = volumeManager.nextVolume(archive, archive.getVolume());
                if (nextVolume == null) {
                    this.nextVolumeMissing = true;
                    return -1;
                }
                FileHeader subHeader = getSubHeader();
                if (subHeader.getUnpVersion() >= 20 && subHeader.getFileCRC() != -1 && getPackedCRC() != (~subHeader.getFileCRC())) {
                    throw new CrcErrorException();
                }
                UnrarCallback unrarCallback = this.archive.getUnrarCallback();
                if (unrarCallback != null && !unrarCallback.isNextVolumeReady(nextVolume)) {
                    return -1;
                }
                this.archive.setVolume(nextVolume);
                FileHeader nextFileHeader = this.archive.nextFileHeader();
                if (nextFileHeader == null) {
                    return -1;
                }
                init(nextFileHeader);
            } else {
                i.n();
                return 0;
            }
        }
        if (i5 != -1) {
            return i4;
        }
        return i5;
    }

    public void unpWrite(byte[] bArr, int i, int i2) {
        if (!this.testMode) {
            this.outputStream.write(bArr, i, i2);
        }
        this.curUnpWrite += i2;
        if (!this.skipUnpCRC) {
            boolean isOldFormat = this.archive.isOldFormat();
            long j = this.unpFileCRC;
            if (isOldFormat) {
                this.unpFileCRC = RarCRC.checkOldCrc((short) j, bArr, i2);
            } else {
                this.unpFileCRC = RarCRC.checkCrc((int) j, bArr, i, i2);
            }
        }
    }

    public void init(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.unpPackedSize = 0L;
        this.testMode = false;
        this.skipUnpCRC = false;
        this.packVolume = false;
        this.unpVolume = false;
        this.nextVolumeMissing = false;
        this.encryption = 0;
        this.decryption = 0;
        this.totalPackRead = 0L;
        this.curUnpWrite = 0L;
        this.curUnpRead = 0L;
        this.curPackWrite = 0L;
        this.curPackRead = 0L;
        this.packedCRC = -1L;
        this.unpFileCRC = -1L;
        this.packFileCRC = -1L;
        this.subHead = null;
        this.totalArcSize = 0L;
        this.processedArcSize = 0L;
    }
}
